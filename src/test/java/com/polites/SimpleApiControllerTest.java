package com.polites;


import com.polites.model.GetService;
import com.polites.view.GetResponse;
import com.polites.view.ResponseFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath*:/testContext.xml", "file:src/main/webapp/WEB-INF/applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class SimpleApiControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private GetService getHandler;

    @Autowired
    private ResponseFactory responseFactory;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testViewSuccess() throws Exception {

        GetResponse mockResponse = new GetResponse();

        int id = 69;
        String result = "test-result";

        Mockito.when(responseFactory.newGetResponse()).thenReturn(mockResponse);
        Mockito.when(getHandler.handleGet(Mockito.anyInt())).thenReturn(result);

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/api/view?id={id}", id);
        mockMvc.perform(builder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(result));

        Mockito.verify(responseFactory, Mockito.times(1)).newGetResponse();
        Mockito.verify(getHandler, Mockito.times(1)).handleGet(id);
    }

}

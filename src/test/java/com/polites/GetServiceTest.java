package com.polites;

import com.polites.model.GetBackend;
import com.polites.model.GetService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class GetServiceTest {

    @InjectMocks
    private GetService handler;

    @Mock
    private GetBackend backend;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public void testGetHandler() {
        Mockito.when(backend.getValue(Mockito.anyInt())).thenReturn(69L);
		assertEquals("foobar-69", handler.handleGet(23));
	}

}

package com.polites;

import com.polites.model.GetBackend;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GetBackendTest {

    @InjectMocks
    private GetBackend backend;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetValue() {

        // This is a pointless test because the class itself is pointless
        // but it's just here to make sure coverage checks are met.
        Assert.assertEquals(144, backend.getValue(72));
    }

}

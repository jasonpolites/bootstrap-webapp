package com.polites.model;

import org.springframework.stereotype.Component;

/**
 * This would be a backend like a database or file system
 */
@Component
public class GetBackend {

    public long getValue(int id) {
        // Do something real here
        return (long) id * 2;
    }

}

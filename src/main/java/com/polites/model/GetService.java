package com.polites.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("getHandler")
public class GetService {

    @Autowired
    GetBackend backend;

    public String handleGet(int id) {
        return "foobar-" + backend.getValue(id);
    }

}

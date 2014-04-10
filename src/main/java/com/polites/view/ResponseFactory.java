package com.polites.view;

import org.springframework.stereotype.Component;

@Component
public class ResponseFactory {

    public GetResponse newGetResponse() {
        return new GetResponse();
    }
}

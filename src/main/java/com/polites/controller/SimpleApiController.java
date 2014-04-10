package com.polites.controller;


import com.polites.model.GetService;
import com.polites.view.GetResponse;
import com.polites.view.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A simple webapp controller
 */
@Controller
@RequestMapping(value = "/api", produces = "application/json")
public class SimpleApiController {

    @Autowired
    ResponseFactory responseFactory;

    @Autowired
    GetService getHandler;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    @ResponseBody
    public GetResponse get(@RequestParam(required = true) int id) {
        GetResponse viewResponse = responseFactory.newGetResponse();
        viewResponse.setName(getHandler.handleGet(id));
        return viewResponse;
    }

}

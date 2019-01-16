package com.service.cse.controller;


import javax.ws.rs.core.MediaType;

import com.service.cse.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-10-31T02:48:41.812Z")

@RestSchema(schemaId = "springmvc")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class SpringmvcImpl {

    @Autowired
    private SpringmvcDelegate userSpringmvcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public User helloworld(@RequestParam(value = "id", required = true) int id){

        return userSpringmvcDelegate.helloworld(id);
    }

}

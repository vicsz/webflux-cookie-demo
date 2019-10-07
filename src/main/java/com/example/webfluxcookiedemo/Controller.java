package com.example.webfluxcookiedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${vcap.application.instance_id:localInstanceId}")
    private String instanceId;

    @RequestMapping("/")
    public String index(){

        return "Instance Id " + instanceId;
    }
}

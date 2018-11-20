package com.epam.edp.demo.conroller;

import com.epam.edp.demo.service.HelloEdpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    private HelloEdpService edpService;

    @Autowired
    public void setEdpService(HelloEdpService edpService) {
        this.edpService = edpService;
    }

    @GetMapping(value = "/api/hello")
    @ResponseStatus(HttpStatus.CREATED)
    public String hello() {
        return edpService.getHelloWorld();
    }
}
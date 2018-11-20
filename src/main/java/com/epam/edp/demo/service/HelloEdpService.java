package com.epam.edp.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
public class HelloEdpService {

    private static final String HELLO_WORLD = "Hello World!";

    public String getHelloWorld() {
        return HELLO_WORLD;
    }
}
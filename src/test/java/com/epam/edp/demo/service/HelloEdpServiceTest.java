package com.epam.edp.demo.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;


/**
 * @author Roman_Martseniuk
 */
public class HelloEdpServiceTest {

    private HelloEdpService edpService;

    @Before
    public void setUp() throws Exception {
        this.edpService = new HelloEdpService();
    }

    @Test
    public void testGetHelloWorldThenGetHelloWorld() {
        String expected = "Hello World";
        assertThat(edpService.getHelloWorld(), is(expected));
    }

    @Test
    public void testGetHelloWorldThenContainHello() {
        assertThat(edpService.getHelloWorld(), containsString("Hello"));
    }

    @Test
    public void testGetHelloWorldThenContainTwoWord() {
        assertThat(edpService.getHelloWorld().split(" ").length, is(2));
    }
}
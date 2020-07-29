package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Service service;

    @BeforeEach
    void init() {
        System.out.println("Before");
    }
    @Test
    void test_add() {
        Assertions.assertEquals(2+3, service.add(2, 3));
    }

    @AfterEach
    void after() {
        System.out.println("After");
    }

}

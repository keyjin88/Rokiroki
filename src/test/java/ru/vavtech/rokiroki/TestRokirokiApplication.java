package ru.vavtech.rokiroki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestRokirokiApplication {

    public static void main(String[] args) {
        SpringApplication.from(RokirokiApplication::main).with(TestRokirokiApplication.class).run(args);
    }

}

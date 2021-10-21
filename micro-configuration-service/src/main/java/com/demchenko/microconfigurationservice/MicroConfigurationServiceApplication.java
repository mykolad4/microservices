package com.demchenko.microconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroConfigurationServiceApplication.class, args);
    }

}

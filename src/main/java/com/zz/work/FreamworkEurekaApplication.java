package com.zz.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FreamworkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreamworkEurekaApplication.class, args);
    }

}

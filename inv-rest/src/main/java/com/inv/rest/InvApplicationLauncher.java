package com.inv.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.inv.rest", "com.inv.core"})
@ComponentScan(basePackages = {"com.inv.rest"})
public class InvApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(InvApplicationLauncher.class, args);
    }
}

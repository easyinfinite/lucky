package com.lucky.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@SpringBootApplication
@SpringBootConfiguration
@EnableDiscoveryClient
@Configuration
@RestController
@RequestMapping("/alibaba")
public class ProvderApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(ProvderApplication.class, args);
    }

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/getBook/{id}")
    public Object getBook(@PathVariable Integer id) {
        System.out.println("<><>><><><><>><><>");
        return "当前实例------> A"+ "当前端口------>"+ applicationContext.getEnvironment().getProperty("server.port");
    }
}


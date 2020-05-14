package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@SpringBootApplication
@SpringBootConfiguration
@EnableDiscoveryClient
@Configuration
@EnableFeignClients
public class MemberApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}


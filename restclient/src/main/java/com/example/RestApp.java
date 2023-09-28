package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class RestApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(RestApp.class,args);
    }

    @Bean
    public RestTemplate  restTemplate(){
        return new RestTemplate();
    }
}

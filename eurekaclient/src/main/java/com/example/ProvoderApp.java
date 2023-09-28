package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ProvoderApp
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Client" );
        SpringApplication.run(ProvoderApp.class,args);
    }
}

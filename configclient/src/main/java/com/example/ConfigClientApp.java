package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ConfigClientApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(ConfigClientApp.class,args);
    }
}

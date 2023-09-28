package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class NativeConfigClientApp
{
    public static void main( String[] args )
    {
        System.out.println( "ConfigClient Hello World!" );
        SpringApplication.run(NativeConfigClientApp.class,args);
    }
}

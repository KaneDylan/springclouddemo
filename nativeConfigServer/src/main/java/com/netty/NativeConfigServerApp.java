package com.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApp
{
    public static void main( String[] args )
    {
        System.out.println( "ConfigServerApp Hello World!" );
        SpringApplication.run(NativeConfigServerApp.class,args);
    }
}

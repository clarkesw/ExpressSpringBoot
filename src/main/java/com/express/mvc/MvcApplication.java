package com.express.mvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MvcApplication implements CommandLineRunner{

    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);
//        String[] names = context.getBeanDefinitionNames();
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}

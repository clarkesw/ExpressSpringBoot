/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.express.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
//@EnableWebMvc
public class MvcAppConfig {
    
 //   @Bean
    public ViewResolver viewResolver(){
//        InternalResourceViewResolver vResolve = new InternalResourceViewResolver(); 
//        vResolve.setPrefix("/WEB-INF/view/");
//        vResolve.setSuffix(".jsp");
//        return vResolve;
        return null;
    }
}

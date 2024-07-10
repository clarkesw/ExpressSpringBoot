package com.express.mvc.autoconfigure;

import com.express.mvc.Test;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class NoteAppAutoConfig2 {
    @Bean
    Test test(){
        return new Test();
    }
 
//    @Bean
//    Test2 test2(){
//        return new Test2();
//    }   
}

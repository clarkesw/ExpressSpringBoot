package com.express.mvc.autoconfigure;

import com.express.mvc.Test;
import com.express.mvc.autoconfigure.conditions.MyCondition2;
import com.express.mvc.dao.NoteDao;
import com.express.mvc.dao.NoteDaoImpl;
import com.express.mvc.service.NoteService;
import com.express.mvc.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@AutoConfigureAfter(NoteAppAutoConfig2.class)
@ConditionalOnClass(MyCondition2.class)
public class NoteAppAutoConfig {
        
    @Bean
    @ConditionalOnProperty(
            prefix="note", 
            name="service.noteService.enable", 
            havingValue="true")
    NoteService noteServ(@Autowired NoteDao noteDao){
        return new NoteServiceImpl(noteDao);
    }
    
    @Bean
    @ConditionalOnBean(Test.class) //value={Test.class}
    NoteDao noteDao(){
        return new NoteDaoImpl();
    }
}

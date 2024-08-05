package com.express.mvc;

import com.express.mvc.dao.NoteTrackerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})
public class MvcApplication implements CommandLineRunner{

    @Autowired
    NoteTrackerDAO noteDAO;
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       noteDAO.saveNote();
    }
}

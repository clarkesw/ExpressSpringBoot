package com.express.mvc;

import com.express.mvc.entity.NoteEntity;
import com.express.mvc.service.NoteTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MvcApplication implements CommandLineRunner{
//http://localhost:8080/insert/d/pot%20belly
    @Autowired
    NoteTrackerService servTrack;
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MvcApplication.class, args);
//        String[] names = context.getBeanDefinitionNames();
    }

    @Override
    public void run(String... args) throws Exception {
//        List<NoteEntity> findAll = nTrack.findAll();
//        findAll.stream()
//                .forEach(System.out::println);
        
//        servTrack.updateNote(1, new NoteEntity("Seven", "Data Source big bike"));
        NoteEntity noteById = servTrack.findById(3);
        System.out.println(noteById);
    }
}

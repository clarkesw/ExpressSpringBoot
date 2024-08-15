package com.express.mvc.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class AppConfig {
    
    @Bean
    DataSource dataSource() {
        return new DriverManagerDataSource("jdbc:mysql://localhost:3306/noteTrackerDB?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
    }

    @Bean
    JdbcTemplate jdbTemplate(@Autowired DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }    
}

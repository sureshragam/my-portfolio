package com.sureshragam.my_portfolio.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

@Component
public class MongoConnectionCheck implements CommandLineRunner {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            String dbName = mongoTemplate.getDb().getName();
            System.out.println("✅ Successfully connected to MongoDB database: " + dbName);
        } catch (Exception e) {
            System.out.println("❌ Failed to connect to MongoDB: " + e.getMessage());
        }
    }
}

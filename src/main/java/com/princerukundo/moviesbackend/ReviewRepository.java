package com.princerukundo.moviesbackend;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@CrossOrigin
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    @Configuration
    class CorsConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("*")  // Allow requests from any origin
                    .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                    .allowedHeaders("*");  // Allowed headers
        }
    }
}
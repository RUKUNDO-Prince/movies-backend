package com.princerukundo.moviesbackend;

import org.springframework.boot .SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@SpringBootApplication

public class MoviesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesBackendApplication.class, args);
	}


}

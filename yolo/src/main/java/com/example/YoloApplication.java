package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
//@EnableJdbcHttpSession
@EnableJpaAuditing

public class YoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoloApplication.class, args);
	}
}

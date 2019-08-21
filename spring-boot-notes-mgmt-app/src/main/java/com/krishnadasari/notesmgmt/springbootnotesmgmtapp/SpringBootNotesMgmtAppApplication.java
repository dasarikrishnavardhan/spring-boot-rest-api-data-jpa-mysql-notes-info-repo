package com.krishnadasari.notesmgmt.springbootnotesmgmtapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.krishnadasari.notesmgmt.springbootnotesmgmtapp.dao")
public class SpringBootNotesMgmtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNotesMgmtAppApplication.class, args);
	}

}

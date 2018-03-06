package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	
	@Autowired
	private FavtvseriesRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		this.repository.deleteAll();

		// save a couple of Favtvseries
		this.repository.save(new Favtvseries("Dexter"));
		this.repository.save(new Favtvseries("Mentalist"));

		// fetch all v
		System.out.println("Favtvseries found with findAll():");
		System.out.println("-------------------------------");
		for (Favtvseries favtvseries : this.repository.findAll()) {
			System.out.println(favtvseries);
		}
		System.out.println();

	}
}

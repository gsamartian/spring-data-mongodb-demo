package com.example.demo;

import org.springframework.data.annotation.Id;
public class Favtvseries {
	@Id
	private String id;

	private String name;
	

	public Favtvseries() {
	}

	public Favtvseries(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		return String.format("Favtvseries[id=%s, name='%s'", id,
				name);
	}

}

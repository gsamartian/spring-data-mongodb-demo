package com.example.demo;



import org.springframework.data.mongodb.repository.MongoRepository;

public interface FavtvseriesRepository extends MongoRepository<Favtvseries, String> {

	Favtvseries findByName(String name);
}
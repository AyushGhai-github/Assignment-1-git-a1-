package com.washerDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washerDetails.model.Washers;

@Repository
public interface washerRepository extends MongoRepository<Washers,String> {
}

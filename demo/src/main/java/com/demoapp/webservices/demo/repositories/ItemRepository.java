package com.demoapp.webservices.demo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.demoapp.webservices.demo.models.ItemVO;

public interface ItemRepository extends MongoRepository<ItemVO, String> {
	ItemVO findByIdAndUserId(int id, int userId);
}

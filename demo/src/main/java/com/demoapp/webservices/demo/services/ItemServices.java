package com.demoapp.webservices.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapp.webservices.demo.models.ItemVO;
import com.demoapp.webservices.demo.repositories.ItemRepository;

@Service
public class ItemServices {

	@Autowired
	ItemRepository itemService;
//	
//	int Id =0;
//	int userID = 0;
	public ItemVO collectItem(int Id, int userId) {
		return itemService.findByIdAndUserId(Id, userId);
	}

}

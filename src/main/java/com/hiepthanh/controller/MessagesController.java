package com.hiepthanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiepthanh.model.Messages;
import com.hiepthanh.model.UserInfo;
import com.hiepthanh.repo.MessageRepository;

import util.ResponseUtility;

@RestController 
@RequestMapping("/messages")
public class MessagesController {

	@Autowired
	MessageRepository messRepo;
	
	@RequestMapping(value="/", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Messages>> getMessages(){
		List<Messages> messages = (List<Messages>) messRepo.findAll();
		for (Messages mess : messages) {
			UserInfo us = mess.getUser();
			System.out.println(us);
		}
		if (messages.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Messages>>(messages, HttpStatus.OK);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addMessages(@RequestBody Messages mess ){
		try {
			messRepo.save(mess);
		}catch (Exception e) {
			return new ResponseEntity<String> 
						(ResponseUtility.getResponse(e.getMessage()), 
								HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>(ResponseUtility.getResponse("Successful"),HttpStatus.CREATED);
		
	}

}

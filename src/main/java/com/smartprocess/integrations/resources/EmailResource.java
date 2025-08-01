package com.smartprocess.integrations.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartprocess.integrations.dto.EmailDTO;
import com.smartprocess.integrations.services.EmailService;

@RestController
@RequestMapping(value = "/emails")
public class EmailResource {
	
	@Autowired
	private EmailService service;
	
	@PostMapping
	public ResponseEntity<Void> send(@RequestBody EmailDTO dto){
		service.sendEmail(dto);
		return ResponseEntity.noContent().build();
	}
}

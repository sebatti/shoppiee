package com.shoppiee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
@Controller
public class InitialController {

	
	@GetMapping("/getDummy")
	public ResponseEntity<?> getDummy(){
		return new ResponseEntity("Jesus Loves You", HttpStatus.OK);
	}
	
}

package com.colts.creditscore.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colts.creditscore.service.ScoreCheckService;

@RestController 
@RequestMapping("/lbconnect")
public class ScoreCheckController {
	
	@Autowired
	ScoreCheckService scoreCheckService;
	
	@GetMapping("/checkScore/{id}")
	public String checkScore(@PathVariable int id) {
		return "credit score for id "+id+" is"+scoreCheckService.getScore();
	}

	
}

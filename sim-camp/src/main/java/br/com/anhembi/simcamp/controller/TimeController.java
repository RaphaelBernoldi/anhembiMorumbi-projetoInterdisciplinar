package br.com.anhembi.simcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	
	@RequestMapping(path="/cadastrarTime")
	public String cadastrarTime(){
		System.out.println("cadastrarTime");
		return "cadastrarTime.html";
	}
}

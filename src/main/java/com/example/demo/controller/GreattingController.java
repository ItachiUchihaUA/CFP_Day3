package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Greatting;

import com.example.demo.repo.GreattingRepo;


@Controller

public class GreattingController {
	
	@Autowired
	
	GreattingRepo great;
	
	@RequestMapping("/")
	public String home()

	{
		System.out.println("Cheacking");
		return "home.jsp";
		

	}
	
	@RequestMapping("/great")
	// data coming from student will be asine to student obj
	public String addStudent(Greatting gone) {

		great.save(gone);

		return "show.jsp";
		
	}
	@RequestMapping("/Getting")
	public ModelAndView getGreatting(@RequestParam int id) {
		

		ModelAndView mv = new ModelAndView("New.jsp");
		Greatting st = great.findById(id).orElse(new Greatting());
		mv.addObject(st);
		return mv;
	
	
	}
}

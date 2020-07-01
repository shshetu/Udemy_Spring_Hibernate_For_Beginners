package com.shetu.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// create API : showForm
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	// create API: processForm
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	// create API: processFormVersionTwo - uppercase the name
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest httpServletRequest, Model model) {
		// get the name 
		String studentName = httpServletRequest.getParameter("studentName");
		// uppercase the name
		studentName = studentName.toUpperCase();
		// add Yo!
		String result = "Yo! "+studentName;
		// add to the model: key- message
		model.addAttribute("message",result);
		return "helloWorld";
	}
	
	
	// create API: processFormVersionThree - Message from version 3!
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName")String studentName, Model model) {
			
			// uppercase the name
			studentName = studentName.toUpperCase();
			// add Yo!
			String result = "Hello From Version 3! "+studentName;
			// add to the model: key- message
			model.addAttribute("message",result);
			return "helloWorld";
		}
		
}

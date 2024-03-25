package com.example.result;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ResultController {

	/* http://localhost:8080/evenForm */
	@GetMapping("/evenForm")
	public String evenForm() {
		return "eventest";
	}
	
	/*http://localhost:8080/processEven */
	@GetMapping("/processEven")
	public String processEven(@RequestParam("number") int number, Model model) {
		model.addAttribute("number", number);
		if (number % 2 == 0) {			
			model.addAttribute("result", "Even");
		}else {
			model.addAttribute("result", "Not Even");
		}
		return "evenresult";
	}
	
	/* calling index.html , http://localhost:8080 */
	@RequestMapping("/")  
	public String index()
	{  
		//returns to index.html
		return"index";  
	}	
	
	/* triggered by post call from index.html action=save */
	@PostMapping("/save") 
	/* index.html input value object and User POJO object should match */
	public ModelAndView save(@ModelAttribute User user)
	{  
	ModelAndView modelAndView = new ModelAndView();  
	/* calling user-data.html */
	modelAndView.setViewName("user-data");      
	/* passing user object */
	modelAndView.addObject("user", user);    
	return modelAndView;  
	}  
}

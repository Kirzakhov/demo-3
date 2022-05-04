package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView demo(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("sobj", student);
		mv.setViewName("home");
		System.out.println("MV= "+mv);
		return mv;
	}
}

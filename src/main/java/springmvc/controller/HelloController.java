package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Controller
@RequestMapping("/hello.do")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("helloPage");
		model.addObject("msg", "Hello Viewers");
		model.addObject("vals" , "Welcome to Spring MVC First Example!");
		

		return model;

	}
}

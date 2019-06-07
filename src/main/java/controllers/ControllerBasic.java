package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/hola")
public class ControllerBasic {
	
	@RequestMapping(path = {"/saludar","/holamundo"})
	public String saludar() {
		return "index";
	}
}

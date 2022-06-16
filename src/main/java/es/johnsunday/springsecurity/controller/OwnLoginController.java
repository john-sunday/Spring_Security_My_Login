package es.johnsunday.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnLoginController {
	
	@GetMapping("/myLoginForm")
	public String showOwnLoginForm() {		
		return "own_login";
	}
}

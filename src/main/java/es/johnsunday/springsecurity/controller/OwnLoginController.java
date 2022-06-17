package es.johnsunday.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnLoginController {
	
	@GetMapping("/myLoginForm")
	public String showOwnLoginForm() {		
		return "bootsnipp.com_login";
	}
	
	// Agregate mapping to administrators.
	@GetMapping("/administrators")
	public String showAdministrators() {		
		return "administrators";
	}
}

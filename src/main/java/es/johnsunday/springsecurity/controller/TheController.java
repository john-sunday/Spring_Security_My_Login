package es.johnsunday.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheController {

	// Método que nos mapea el archivo que nos tiene que devolver.
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
}

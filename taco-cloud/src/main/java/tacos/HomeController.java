package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")	// Obsluga zadan kierowanych do katalogu glownego sciezki dostepu
	public String home() {
		return "home";
	}
	
	
}

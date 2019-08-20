package mx.com.nut.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	public static final String ERROR_VIEW = "404";
	public static final String NOT_FOUND = "500";
	
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("showError");
	}
	
	@GetMapping("/showError")
	public String showForm(Model model) {
		return ERROR_VIEW;
	}
	
	@GetMapping("/notFound")
	public String showNotFound(Model model) {
		return NOT_FOUND;
	}
	

}

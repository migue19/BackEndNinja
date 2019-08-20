package mx.com.nut.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	public static final String EXAMPLE_VIEW = "example2";

	// http://localhost:8080/example2/request1?nm=Eva
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "World") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("name", name);
		return mav;
	}

	// http://localhost:8080/example2/request1/Eva
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("name", name);
		return mav;
	}

}

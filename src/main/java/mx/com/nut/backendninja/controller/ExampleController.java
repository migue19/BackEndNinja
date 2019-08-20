package mx.com.nut.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.com.nut.backendninja.component.ExampleComponent;
import mx.com.nut.backendninja.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//primera forma
	@GetMapping("/exampleString")
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET )
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("people", exampleService.getListPeople());
		return EXAMPLE_VIEW;
	}
	
	//segunda forma
	//@RequestMapping(value="/exampleMAV", method=RequestMethod.GET )
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people", exampleService.getListPeople());
		return mav;
	}

	
//	private List<Person> getPeople(){
//		List<Person> people = new ArrayList<>();
//		
//		people.add(new Person("migue", 12));
//		people.add(new Person("pedro", 13));
//		people.add(new Person("juan", 14));
//		people.add(new Person("memo", 15));
//		
//		return people;		
//	}
	
	

}

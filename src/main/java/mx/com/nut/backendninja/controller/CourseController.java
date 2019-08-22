package mx.com.nut.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mx.com.nut.backendninja.entity.Course;
import mx.com.nut.backendninja.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	private static final String COURSES_VIEW = "courses";
	private static final String ADD_COURSES_VIEW = "addCourse";
	private static final String UPDATE_COURSES_VIEW = "updateCourse";
	private static final Log LOGGER = LogFactory.getLog(CourseController.class);
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService;
	
	@GetMapping("/listCourses")
	public ModelAndView listAllCourse() {
		LOGGER.info("Call: " + "listAllCourses()");
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("courses", courseService.listAllCourse());
		return mav;
	}
	
	@GetMapping("/addCourse")
	public ModelAndView addCourse() {
		ModelAndView mav = new ModelAndView(ADD_COURSES_VIEW);
		mav.addObject("course",new Course());
		return mav;
	}
	
	@GetMapping("/updateCourse")
	public ModelAndView updateCourse() {
		ModelAndView mav = new ModelAndView(UPDATE_COURSES_VIEW);
		mav.addObject("course",new Course());
		return mav;
	}
		
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute("course") Course course) {
		LOGGER.info("Call: " + "addCourse()" + " -- PARAM: " + course.toString());
		courseService.addCourse(course);
		return "redirect:/courses/listCourses";
	}
	
	
	@GetMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable("id") int id) {
		LOGGER.info("Call: " + "deleteCourse()" + " -- PARAM: " + id);
		courseService.removeCourse(id);
		return "redirect:/courses/listCourses";
	}
	
	
	
	
	
	
	
	

}

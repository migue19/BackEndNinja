package mx.com.nut.backendninja.converter;

import org.springframework.stereotype.Component;

import mx.com.nut.backendninja.entity.Course;
import mx.com.nut.backendninja.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	//Entity --> Model
	public CourseModel entityToModel(Course course) {
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setPrice(course.getPrice());
		courseModel.setHours(course.getHours());
		
		return courseModel;
	}
	
	//Model --> Entity
	public Course modelToEntityCourseModel(CourseModel courseModel) {
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setPrice(courseModel.getPrice());
		course.setHours(courseModel.getHours());
		
		return course;
	}
}

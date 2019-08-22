package mx.com.nut.backendninja.service;

import java.util.List;

import mx.com.nut.backendninja.entity.Course;

public interface CourseService {
	public abstract List<Course> listAllCourse();
	public abstract Course addCourse(Course course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	public abstract Course getCourseById(int id);
}

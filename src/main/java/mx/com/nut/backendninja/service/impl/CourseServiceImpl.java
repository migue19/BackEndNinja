package mx.com.nut.backendninja.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mx.com.nut.backendninja.entity.Course;
import mx.com.nut.backendninja.repository.CourseJpaRepository;
import mx.com.nut.backendninja.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	@Qualifier("courseJpaRepository")
    private CourseJpaRepository courseJpaRepository;
	
	
	@Override
	public List<Course> listAllCourse() {
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		return courseJpaRepository.save(course);
	}

	@Override
	public int removeCourse(int id) {
		courseJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		return courseJpaRepository.save(course);
	}

	@Override
	public Course getCourseById(int id) {
		Course course = courseJpaRepository.findById(id).orElse(null);
		return course;
	}

	

	
}

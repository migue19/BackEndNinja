package mx.com.nut.backendninja.repository;

import org.springframework.stereotype.Repository;

import mx.com.nut.backendninja.entity.QCourse;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {
	
	private QCourse qCourse = QCourse.course;

}

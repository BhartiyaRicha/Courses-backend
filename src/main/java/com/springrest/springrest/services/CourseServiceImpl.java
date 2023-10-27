package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
//	
//	public CourseServiceImpl() {
//		 list =new ArrayList<>();
//		 list.add(new Course(145, "Java"," Basics of Java"));
//		 list.add(new Course(146, "Spring Boot"," Creating Rest API"));
//		 
//		 
//	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getReferenceById(courseId);
		
	}
	@Override
	public Course addCourse(Course course) {
		 courseDao.save(course);
		 return course;
	}
	@Override
	public Course updateCourse(Course course) {
			courseDao.save(course);
			return course;
	}
	@Override
	public void deleteCourse(long courseId) {
		//Course entity=courseDao.getReferenceById(courseId);
		courseDao.deleteById(courseId);
		
		
	}

}

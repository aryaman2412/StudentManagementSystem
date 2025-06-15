package com.StudentManagementSystem.service;
import java.util.List;

import com.StudentManagementSystem.entity.Student;


public interface StudentService {
	
	public List<Student> getAllStudents();
	
	
	public Student saveStudent(Student student);
	
	public Student getByID(int id);
	
	
	public void  deleteById(int id);
}

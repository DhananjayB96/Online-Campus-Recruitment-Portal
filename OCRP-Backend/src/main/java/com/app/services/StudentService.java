package com.app.services;

import java.util.List;

import com.app.pojos.Job;
import com.app.pojos.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentById(int sId);

	public Student registerStudent(Student student);

	public Student updateStudent( int sId,Student student);

	public String deleteStudentById(int sId);

	public String applyJob(int sId,Job job);
	
	
	
}

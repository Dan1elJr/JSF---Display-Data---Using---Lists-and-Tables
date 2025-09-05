package com.sandaniel.jsf.listandtabledemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	private List<Student> student;
	
	public StudentDataUtil() {
		
		loadSampleData();
	}
	
	public void loadSampleData() {
		
		student = new ArrayList<>();
		
		student.add(new Student("Daniel","Junior","daniel1903@"));
		student.add(new Student("Mary","Brown","mary2030@"));
		student.add(new Student("John","Doe","doe3030@"));
		
	}
	

	public List<Student> getStudents() {
		return student;
	}
	
	
}

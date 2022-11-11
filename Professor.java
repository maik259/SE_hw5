package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee {
	private List<Professor> profList = new ArrayList<Professor>();		//possible, as 1-3 professors may be assigned to one course
	
	private Course assignedCourse;										//courses, that are assigned to certain professor
	private TA assignedTA;												//TA, that are assigned to certain professor
	
	public Professor(String name, int id, Course course, TA ta) {
		super(name, id);												//initializes new employee, as professor is also an employee
		Professor prof = new Professor(name, id, course, ta);			//initializes new professor, assigns course
		prof.assignedCourse = course;									
		prof.assignedTA = ta;											//assigns ALL TA of the course to assignedTA
		profList.add(prof);												//adds professor to profList
	}

	public void publicCourse() {								//no idea what function is desired compared to addCourse
	}

	public void assignTA(String name, Course course) {
		assignedTA = new TA(name, course);						//course could also be redundant, as course == assignedCourse
	}

	public void addCourse(int id, String courseName, int cap, Professor prof) {
		Course newCourse = new Course(id, courseName, cap, prof); 
		assignedCourse = newCourse;
	}

	public List<Professor> getProfessor() {
		return this.profList;					//may return a List of 1-3 professors
	}

}

package exercise2;

import java.util.ArrayList;
import java.util.List;

public class TA {
	private List<TA> assistantList = new ArrayList<TA>();		//List of TA, as *-many TA may be assigned to one course
	
	private String name;
	private Course course;
	
	public TA(String name, Course course) {
		TA assistant = new TA(name, course);
		assistant.name = name;
		assistant.course = course;
		assistantList.add(assistant);	
	}
	
	public Course getCourse() {
		return this.course;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void extendContract(Course course) {
		this.course = course;						//assigns new course, as i don't see why you need a function to extend the contract with given attributes/classes
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Project extends Student{
	private String name;
	private List<Student> stuList = new ArrayList<Student>();			//required, as *-students can have the same project
	
	public Project(int id, String name, String projectName) {
		super(id, name);
		this.name = projectName;
		this.stuList.add(id, getProject());
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	public void addMember(Student student) {
		stuList.add(student);							//adds member to project
	}
	
	public List<Student> getMembers() { 
		return stuList;									//returns list of members of project
	}

}
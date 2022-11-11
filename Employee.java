package exercise2;

public class Employee {
	private String name;
	private int employeeId;

	public Employee(String name, int id) {
		setName(name);
		setEmployeeId(id);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}

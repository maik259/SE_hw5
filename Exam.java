package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	private int maxValue;
	private List<Student> examList = new ArrayList<Student>();

	public boolean register(Student student) {
		if (maxValue == examList.size()) {
			return false;
		} else {
			examList.add(student);
			return true;
		}
	}

	public void addQuestion(int id, String task, int value) {
		Question q = new Question(id, task, value);
	}

	public List<Student> getRegisteredStudents() {
		return examList;
	}

	public void setMaxValue(int max) {
		maxValue = max;
	}
}

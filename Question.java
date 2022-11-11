package exercise2;

public class Question extends Exam{
	private String task; 
	private int maxValue;
	private int id;
	
	public Question(int id, String task, int value) {
		this.id = id;
		this.maxValue = value;
		this.task = task;
	}
	
}

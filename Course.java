package exercise2;

public class Course {
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull = false;
	private int countStudent = 0; 				// not mandatory, but convenient to keep track whether course is full or not without changing maxCapacity
	private Professor courseProf;
	private TA courseTA;
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		maxCapacity = cap;
		if (maxCapacity == 0) {					//should be impossible, maybe an assignment for courses, that are yet to be published
			isFull = true;
		}
		courseProf = prof;
	}

	public void setMaxCap(int max) {
		maxCapacity = max;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void enroll(Student student) {
		if (isFull == false) {
			countStudent++;
			
			if (maxCapacity == countStudent) {
				isFull = true;
			}
		}
	}

	public Professor getProf() {
		return this.courseProf;
	}	
		
	public void apply(TA ta) {
		int temp = Math.random() <= 0.5 ? 1 : 2; 		//no condition given, thus 50/50 chance of success
		if(temp == 1) {
			setTA(ta);
		}
	}
	
	public TA getTA() {
		return this.courseTA;
	}
	
	public void setTA(TA ta) {
		TA assistant = ta;
	}
	
}

package Week4Answer;

public class StudentGrade {
	
	private int Grade;
	private String name;
	final int DEFAULT_GRADE = 60;
	final int MAXIMUM_GRADE = 100;
	final int MINIMUM_GRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	
	public StudentGrade(String name) {
		this.name = name;
		Grade = DEFAULT_GRADE;
	
	}
	
	public StudentGrade(String name, int Grade) {
		this.name = name;
		this.Grade = Grade;
		
	}
	
	public void setGrade(int Grade) {
		if (Grade > MAXIMUM_GRADE || Grade < MINIMUM_GRADE) {
			
			this.Grade = DEFAULT_GRADE;
		}
		
		else {
			this.Grade = Grade;
		}
	}
	
	public int getGrade() {
		
		return Grade;
		
	}
	
	public String getLetterGrade() {
		
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		
		if (Grade >= AGRADE) {
			return A;
		}else if (Grade < AGRADE && Grade >= BGRADE) {
			return B;
		}else if (Grade < BGRADE && Grade >= CGRADE) {
			return C;
		}else {
			return D;
		}
		
		
	}
	
	
	

}

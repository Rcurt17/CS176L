package week2HW;

public class Student_Tester {

	public static void main(String[] args) {
		Student Raul = new Student("Raul");
		
		Raul.addQuiz(100);
		Raul.addQuiz(90);
		Raul.addQuiz(85);
		Raul.addQuiz(87);
		Raul.addQuiz(75);
		
		System.out.println(Raul.getName());
		System.out.println(Raul.getScores());
		System.out.println(Raul.getAverageScore());
		
	}

}

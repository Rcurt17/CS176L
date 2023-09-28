package Week4Answer;

public class StudentGradeTester {

	public static void main(String[] args) {
		
		StudentGrade steph = new StudentGrade("Steph");
		
		StudentGrade hannah = new StudentGrade("Hannah", 99);
		
		System.out.println(steph.getGrade()); // expect 60
		
		System.out.println();
		
		System.out.println(hannah.getGrade()); // expect 99
		
		steph.setGrade(-100);
		
		System.out.println();
		
		System.out.println(steph.getGrade()); // expect 60
		
		System.out.println();
		
		steph.setGrade(1000); 
		
		System.out.println(steph.getGrade()); // expect 60
		
		System.out.println();
		
		steph.setGrade(88);
		
		System.out.println(steph.getGrade()); // expect 88
		
		System.out.println();
		
		System.out.println(hannah.getLetterGrade());
		
		System.out.println();
		
		System.out.println(steph.getLetterGrade());
		
		System.out.println();
		
		steph.setGrade(77);
		
		System.out.println(steph.getLetterGrade());
		
		System.out.println();
		
		steph.setGrade(54);
		
		System.out.println(steph.getLetterGrade());
		

	}

}

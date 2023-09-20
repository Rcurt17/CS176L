package Problems1;

public class MyOwnJavaClass {
	
	private String className;
	private int classNumber;
	private int numberOfKids;
	
	public MyOwnJavaClass() {
		className = "unknown";
		classNumber = 0;
		numberOfKids = 0;
	}
	
	public String getName() {
		return className;
		
	}
	
	public void setName(String className) {
		this.className = className;
	}
	
	public int getClassNumber() {
		return classNumber;
	}
	
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	public int getNumberOfKids() {
		return numberOfKids;
	}
	
	public void setNumberOfKids(int numberOfKids) {
		this.numberOfKids = numberOfKids;
	}

	public static void main(String[] args) {
		MyOwnJavaClass Java101 = new MyOwnJavaClass();
		
		Java101.setName("Java 101");
		System.out.println(Java101.getName());
		Java101.setClassNumber(101);
		System.out.println(Java101.getClassNumber());
		Java101.setNumberOfKids(25);
		System.out.println(Java101.getNumberOfKids());

	}

}

package Problems3;

public class Employee {
	private String employeeName;
	private double currentSalary;
	private double byPercent;
	
	public Employee() {
		employeeName = "unkown";
		currentSalary = 0;
		
	}
	
	
	public Employee(String employeeName, double currentSalary) {
		this.employeeName = employeeName;
		this.currentSalary = currentSalary;
		
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setName(String employeeName) {
		this.employeeName = employeeName;
		
	}
	
	public double getCurrentSalary() {
		return currentSalary;
		
	}
	
	public void setCurrentSalary() {
		this.currentSalary = currentSalary;
		
	}
	
	public void raiseSalary(double byPercent) {
		currentSalary += (byPercent * 0.01 * currentSalary);
		this.byPercent = byPercent;
	}



public static void main(String args[]) {
	Employee Raul = new Employee("Raul", 60000);
	System.out.println(Raul.getName());
	System.out.println(Raul.getCurrentSalary());
	Raul.raiseSalary(20);
	System.out.println(Raul.getCurrentSalary());
	
	
	
	
	
	
	
	}
}
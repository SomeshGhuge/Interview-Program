package Encapsulation;

public class Use_of_Setter_Getter {
	// This is how we initialise the setter or getter info
	private int salary;

	public int getSalary() {
		if(salary>1000) {
			return salary;
		}else {
		System.out.println("Your salary is less than 1000");
		return salary;
		}
		
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}

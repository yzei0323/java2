package day5Prac.애너테이션실습;

public class Employee {
	
	
	String name;	
	
	@WeekDaysAvail( value= { "Monday", "Friday"})
	String offDay;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOffDay() {
		return offDay;
	}


	public void setOffDay(String offDay) {
		this.offDay = offDay;
	}


	public Employee(String name, String offDay) {
		super();
		this.name = name;
		this.offDay = offDay;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", offDay=" + offDay + "]";
	}
	

}

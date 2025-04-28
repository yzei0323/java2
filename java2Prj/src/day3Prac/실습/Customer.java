package day3Prac.실습;

public class Customer {

	String id;
	String name;
	String grade;
	int point;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Customer(String id, String name, String grade, int point) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
}

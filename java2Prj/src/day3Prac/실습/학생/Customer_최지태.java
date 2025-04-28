package day03Prac.실습;

public class Customer {
	private String id;
	private String name;
	private String grade;
	private int point;

	public Customer(String id, String name, String grade, int point) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}

}

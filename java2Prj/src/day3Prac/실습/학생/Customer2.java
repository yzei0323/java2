package day3Prac.실습.학생;

public class Customer2 {
	int id;
	String name;
	String grade;
	int point;
	
	public Customer2(int id, String name, String grade, int point) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}
	
}

package day3Prac.stream3;

public class Acorn {
	String id;
	String name;
	String pw;
	
	
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Acorn(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	public Acorn() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}
	
}

package day3Prac.comparator인터페이스;

public class Acorn {
	String id;
	String pw;
	public Acorn(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Acorn [id=" + id + ", pw=" + pw + "]";
	}
	
	
}

package day5Prac.실습;

public class Drink {
	String name;
	
	@MaxSugar(value=30)
	int sugar;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public Drink(String name, int sugar) {
		super();
		this.name = name;
		this.sugar = sugar;
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + ", sugar=" + sugar + "]";
	}
	
	public Drink() {
		// TODO Auto-generated constructor stub
	}
	
}

package day2Prac.복습실습;

public class Moving {

	String name;
    String alias ;
    int power;
    
    
	public Moving(String name, String alias, int power) {
		super();
		this.name = name;
		this.alias = alias;
		this.power = power;
	}

	public Moving() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", alias=" + alias + ", power=" + power + "]";
	}
	
}

package day3Prac.collection;

import java.util.Objects;

public class Moving {

	String name;
    String code ;
    int power;
    
    
	public Moving(String name, String code, int power) {
		super();
		this.name = name;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Moving [name=" + name + ", code=" + code + ", power=" + power + "]";
	}

	

	@Override
	public boolean equals(Object obj) { //자기자신과 obj 비교대상과 같은지 판단
		Moving m = (Moving) obj;
		return this.getName().equals(m.getName()) && this.getCode().equals(m.getCode()) && this.getPower()==m.getPower();
	   }
	
	@Override
	public int hashCode() {
		return Objects.hash(code, name, power);
	}

}

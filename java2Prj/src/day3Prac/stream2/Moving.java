package day3Prac.stream2;

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

	


}

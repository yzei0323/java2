package day1prac.제네릭클래스;

public class BoxMain {

	public static void main(String[] args) {
		
		
		Box box = new Box();
		box.setItem("문자열담기");
		String item = (String)box.getItem();

		System.out.println(item);

		
		Box box2 = new Box();
		box2.setItem(new Acorn("KJU", "권지언"));
		Acorn acorn = (Acorn)box2.getItem();
		
		System.out.println(acorn);
		
		
		
		Object o = new Acorn("KJU", "권지언"); //업캐스팅
		Acorn a1 = (Acorn) o;	//다운캐스팅
		
		System.out.println(a1);
		
		
		//잘못된 다운캐스팅
		Object exo = new Object();
		Acorn aex = (Acorn) exo;
		
		//=> 오류발생
		
		System.out.println(aex.getId());
		
		
	}

	
	
	
}

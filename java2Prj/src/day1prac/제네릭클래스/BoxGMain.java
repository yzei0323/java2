package day1prac.제네릭클래스;

public class BoxGMain {

	public static void main(String[] args) {
	
		
		BoxG<String> box = new BoxG<>();		
		box.setItem("문자열만 담기네");
		String item = box.getItem();
		System.out.println(item);
		
		
		BoxG<Acorn> box2 = new BoxG<>();
		box2.setItem(new Acorn("KMH", "김민환"));
		Acorn itemAcorn = box2.getItem();
		
		System.out.println(itemAcorn);
		
		
	}

}

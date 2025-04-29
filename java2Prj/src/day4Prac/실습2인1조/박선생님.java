package day4Prac.실습2인1조;

public class 박선생님 implements Teach {

	@Override
	public String teach(String subject) {
		System.out.println("박선생님 수업듣기");
		return subject;
	}

	@Override
	public void 국어수업듣기() {
		System.out.println("박선생님 국어수업듣기");
		
	}

	@Override
	public void 영어수업듣기() {
		System.out.println("박선생님 영어수업듣기");
		
	}

	@Override
	public void 수학수업듣기() {
		System.out.println("박선생님 수학수업듣기");
		
	}

}

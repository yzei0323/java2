package day2Prac.함수형인터페이스;



public class 박예린 implements MyRunnable
{
	@Override
	public void run()
	{
		String[] lunch = new String[4];
		lunch[0] = "초밥";
		lunch[1] = "연어";
		lunch[2] = "육회";
		lunch[3] = "닭갈비";
		
		int i = (int)(Math.random() * lunch.length);
		
		System.out.println("점메추: " + lunch[i]);
	}
}

package day4Prac.스트림추가;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class 이름개수구하기 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader("src/day4Prac/스트림추가/test.txt"));

		ArrayList<String> list = new ArrayList<>();
		
		String str="";
		while( (str = br.readLine()) != null) {
			list.add(str);
		}
		System.out.println("== 이름개수 ==");
		System.out.println(list.size());
		
		
		//스트림 얻어오기
		System.out.println("== 내 이름 개수 ==");
		Stream <String> stream = list.stream();
		long cnt = stream.filter( s -> s.equals("황예지")).count();
		System.out.println(cnt);
		
	}

}

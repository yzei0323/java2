package day4Prac.스트림추가;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class 이름개수구하기2 {

	public static void main(String[] args) throws IOException {
	
		Stream<String> stream = Files.lines( Paths.get("src/day4Prac/스트림추가/test.txt"));
		
		long cnt = stream.filter( s -> s.equals("권지언")).count();
		System.out.println(cnt);
	}

}

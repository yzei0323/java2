package day3Prac.stream1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01 {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		
		//배열을 스트림으로 얻어오기
		
		//기본형배열을 스트림으로 얻어오기 => Arrays.stream(arr);
		
		IntStream intStream = Arrays.stream(arr);
		int total = intStream.sum();
		
		System.out.println(total);
		
		//
		intStream  = Arrays.stream(arr);
		int oddTot= intStream.filter( n -> n%2 ==1).sum();
		
		System.out.println( oddTot);
	}
 
}

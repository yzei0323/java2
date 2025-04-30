package day5Prac.스택큐;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class 스택큐 {

	public static void main(String[] args) {
		
		// 스택, 큐 => 자료구조 (데이터를 어떻게 저장할 것이냐에 대한 문제)
		// 저장하는 방법, 꺼내는 방법
		
		// 스택 : 바닥이 막힌 통 (먼저 들어간 데이터가 가장 마지막에 나옴) 	1 2 3  ->  3 2 1
		// 큐 : 대기실 (먼저 들어간 데이터가 먼저 나옴) 	1 2 3  ->  1 2 3
		
		
		Stack<String> st = new Stack<>();
		
		//저장하기
		st.push("1");
		st.push("2");
		st.push("3");
		
		//꺼내기
		System.out.println("스택입니당");
		System.out.println("스택은 마지막에 들어간거부터 나옴");
		//String data = st.pop();
		//System.out.println(data);
		
		while(!st.empty()) {
			String data = st.pop();
			System.out.println(data);
		}
		
		
		//
		//큐에 저장하기  offer
		Queue<String> q = new ArrayDeque<>();
		
		q.offer("1");
		q.offer("2");
		q.offer("3");
		
		//꺼내기
		System.out.println("큐입니다 큐!");
		System.out.println("큐는 선입선출");
		//String getdata = q.poll();
		//System.out.println(getdata);
		
		while(!q.isEmpty()) {
			String data = q.poll();
			System.out.println(data);
		}

		
	}

}

package day5Prac.스택큐;

import java.util.Stack;

public class 간단한괄호문제_스택 {

	public static void main(String[] args) {

		// "(()))" => 올바른 괄호니?
		// 스택자료구조를 이용해서 올바른 괄호인지 판별하겠다
		// ( => 스택에 push 담기 ( (
		// ) => 스택에서 꺼내기 )

		String test = "(((()))";
		// String test2="(()";
		// char -> Character
		Stack<Character> stack = new Stack<>();	
		
		//) 꺼내려고 할 때 비어있으면 실패!
		//) 모든 작업이 끝났는데 스택에 남아있으면 실패
		
		boolean result = true;
		for (int i = 0; i < test.length(); i++) {
			char ch = test.charAt(i);
			if (ch == '(') { 	// 스택에 담기
				stack.push(ch);		// ( (
			} else if (ch == ')') { // 스택에서 꺼내기
				if (stack.isEmpty()) {
					result = false;
				}else {
				stack.pop();
				}
			}	
		}
		if(!stack.isEmpty()) {
			result=false;
		}
		
		System.out.println(result);

	}

}

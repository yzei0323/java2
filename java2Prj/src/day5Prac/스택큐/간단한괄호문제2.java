package day5Prac.스택큐;

 

import java.util.Stack;

public class 간단한괄호문제2 {

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // charAt을 사용하여 각 문자를 가져옴

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // 닫는 괄호가 너무 많음
                }
                stack.pop(); // 짝이 맞는 열린 괄호 제거
            }
        }

        return stack.isEmpty(); // 스택이 비었으면 올바른 괄호
    }

    public static void main(String[] args) {
        String[] testlist = {"(()())", "(()", "())(", "((()))", ""};

        for (String test : testlist) {
            System.out.println(test + " → " + isValid(test));
        }
    }
}

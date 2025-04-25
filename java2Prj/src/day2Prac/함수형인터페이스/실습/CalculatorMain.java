package day2Prac.함수형인터페이스.실습;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 덧셈 구현 - 람다식
        Calculator add = (num1, num2) -> num1 + num2;
        
        // 뺄셈 구현 - 람다식
        Calculator subtract = (num1, num2) -> num1 - num2;
        
        // 곱셈 구현 - 람다식
        Calculator multiply = (num1, num2) -> num1 * num2;
        
        // 나눗셈 구현 - 람다식
        Calculator divide = (num1, num2) -> {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return num1 / num2;
        };
        
        // 익명 클래스로 구현한 나머지 연산
        Calculator remainder = new Calculator() {
            @Override
            public double calculate(double num1, double num2) {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                return num1 % num2;
            }
        };
        
        
        
        System.out.println("간단한 계산기 프로그램");
        
        while (true) {
            System.out.println("\n1: 덧셈, 2: 뺄셈, 3: 곱셈, 4: 나눗셈, 5: 나머지, 0: 종료");
            System.out.print("원하는 연산을 선택하세요: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            
            if (choice < 0 || choice > 5) {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                continue;
            }
            
            System.out.print("첫 번째 숫자: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("두 번째 숫자: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            String operation = "";
            
            switch (choice) {
                case 1:
                    result = add.calculate(num1, num2);
                    operation = "+";
                    break;
                case 2:
                    result = subtract.calculate(num1, num2);
                    operation = "-";
                    break;
                case 3:
                    result = multiply.calculate(num1, num2);
                    operation = "*";
                    break;
                case 4:
                    result = divide.calculate(num1, num2);
                    operation = "/";
                    break;
                case 5:
                    result = remainder.calculate(num1, num2);
                    operation = "%";
                    break;
            }
            
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
} 
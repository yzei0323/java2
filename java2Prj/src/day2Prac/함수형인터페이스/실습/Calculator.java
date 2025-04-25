package day2Prac.함수형인터페이스.실습;

@FunctionalInterface
public interface Calculator {
    // 두 개의 숫자를 받아 결과를 반환하는 메소드
    double calculate(double num1, double num2);
} 
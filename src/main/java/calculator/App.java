package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        //  첫번째 양의 정수 입력
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // 두번째 양의 정수 입력
        int num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요:"); // +, - , *, /
        /* charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자 하는 문자열의 위치를 받는다*/
        char operator= sc.next().charAt(0);


        System.out.println("operator="+operator);

    }
}

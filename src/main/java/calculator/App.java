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
        System.out.println("num1, num2="+num1+","+num2);

    }
}

package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "go";
        /* 요구사항 5 , 연산결과 10개를 저장할 수 있는 배열 선언 및 생성*/
        int [] intArrays = new int[10];
        /*연산 저장할 떄마다 카운트용 */
        int count =0;

        /* 요구사항 4 반복문을 이용한  무한연산, exit 입력하면 종료*/
        while (!question.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            //  첫번째 양의 정수 입력
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // 두번째 양의 정수 입력
            int num2 = sc.nextInt();
            int result =0;
            System.out.println("사칙연산 기호를 입력하세요:"); // +, - , *, /
            /* charAt(idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자 하는 문자열의 위치를 받는다*/
            char operator= sc.next().charAt(0);
            /* 요구사항 3 - 입력연산에 관한 코드 ( 덧셈, 뺄쎔, 곱셈 나눗셈 ) */
            /* if 문안에 operator의 연산이 맞는지 확인하기 위해 작은 따옴표 '' 사용*/
            /* ''는 char 타입, ""는 string 타입 */
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
            }
            /*요구사항 6 연산결과가 10개를 초과하는 경우 새로운 결과 값이 하나씩 자리를 차지함  */
            if (count < 10){
                intArrays[count]=result;
                count+=1;
            } else {
                for (int i=1; i<10; i++){
                    intArrays[i-1]=intArrays[i]; // 배열 한칸씩 앞으로
                }
                intArrays[9]=result;  // 최근 result 값을 인덱스 9번자리 넣기
            }
            System.out.println("결과: " + result);
            System.out.println(Arrays.toString(intArrays));  // 확인차 배열 출력
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            question = sc.next();
        }
    }
}

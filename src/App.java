import calc.Calculator;

import java.util.Scanner;

public class App {  //계산기 lv1
    public static void main(String[] args) {

        //객체 생성
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            //1. 정수 입력 받기
            System.out.print("첫 번째 양의 정수를 입력하세요: ");
            long a = sc.nextLong();
            System.out.print("두 번째 양의 정수를 입력하세요: ");
            long b = sc.nextLong();

            //2. 사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            //3. 계산하기
            long result = 0;
            if( operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("연산 기호를 잘못입력하셨습니다.");
                continue;
            } else if (operator == '/' && b == 0) {
                System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                continue;
            } else {
                result = calculator.calculate(a, b, operator);
            }

            //4. 결과 출력
            System.out.println("결과: " + result);
            System.out.println("현재까지의 결과들 : " + calculator.getCalcResultList());

            //5. exit를 입력 받으면 반복 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) break;
        }
    }
}

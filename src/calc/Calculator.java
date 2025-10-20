package calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    //속성
    ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator<>(); //계산기능을 가지고 있는 클래스
    Scanner sc = new Scanner(System.in);

    //생성자

    //기능
    /**
     * 두 수를 입력받고 연산 기호를 입력 받아 계산하고
     * 결과값들을 저장해서 보여주는 기능
     */
    public void calculate() {

        String exit = "";

        do {
            //1. 정수 입력 받기
            System.out.print("첫 번째 수를 입력하세요: ");
            double a = getDoubleInput();
            System.out.print("두 번째 수를 입력하세요: ");
            double b = getDoubleInput();

            //2. 사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            //3. 검증 및 계산하기
            if (!validate(operator, b)) {
                continue;
            }
            double result = arithmeticCalculator.calculate(a, b, operator);

            //4. 결과 출력
            System.out.println("결과: " + result);
            System.out.println("현재까지의 결과들 : " + arithmeticCalculator.getCalcResultList());
            System.out.println("현재까지 더 큰 수의 결과들 : " + arithmeticCalculator.getBiggerResults(result));


            //5. exit를 입력 받으면 반복 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();
        } while (!"exit".equals(exit));
    }

    /**
     * 연산기호를 입력받고 확인하는 메서드
     * 1. 연산기호 / 와 정수 0 은 입력될 수 없음
     * @param operator  연산 기호
     * @param b 나누기 시 0이면 안되어서 매개변수로 받음
     * @return  valid를 거쳐서 옳은 값이 오면 true
     */
    private boolean validate(char operator, double b) {
        //연산 기호 확인
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.println("연산 기호를 잘못입력하셨습니다.");
            return false;
        } else if (operator == '/' && b == 0) {
            System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
            return false;
        }
        return true;
    }

    /**
     * 숫자를 입력받아 숫자가 아니면 숫자를 받게 하는 valid
     * @return  입력받은 숫자
     */
    private double getDoubleInput() {
        double num;

        while (true) {
            try {
                num = sc.nextDouble();
                break;
            } catch (InputMismatchException ignored) {
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine();  //캐시를 비워둬야함
            }
        }
        return num;
    }
}

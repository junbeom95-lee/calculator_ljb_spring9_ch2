public class App {  //계산기 lv1
    public static void main(String[] args) {

        //반복문 만들기
        while (true) {
            //정수 입력 받기 test
            long a = 20;
            long b = 30;
            //사칙연산 기호 입력 받기 test
            String operator = "/";

            //1.계산하기
            long result = 0;

            if (operator.equals("+")) {         //1-1. 계산하기 - 덧셈
                result = a + b;
            } else if (operator.equals("-")) {  //1-2. 계산하기 - 뺄셈
                result = a - b;
            } else if (operator.equals("*")) {  //1-3. 계산하기 - 곱셈
                result = a * b;
            } else if (operator.equals("/")) {  //1.4 계산하기 - 나눗셈
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = a / b;
            } else {
                System.out.println("연산 기호를 잘못입력하셨습니다.");
                continue;
            }

            //2. 결과 출력
            System.out.println("결과: " + result);

            //4. exit를 입력 받으면 반복 종료
            break;
        }
    }
}

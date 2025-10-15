import java.util.Scanner;

public class App {  //계산기 lv1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //반복문 만들기
        while (true) {
            //정수 입력 받기
            System.out.print("첫 번째 양의 정수를 입력하세요: ");
            long a = sc.nextLong();
            System.out.print("두 번째 양의 정수를 입력하세요: ");
            long b = sc.nextLong();

            //사칙연산 기호 입력 받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            //5. 계산하기

            //5-1. 계산하기 (덧셈)

            //5-2. 계산하기 (뺄셈)

            //5-3. 계산하기 (곱셈)

            //5.4. 계산하기 (나눗셈)

            //exit를 입력 받으면 반복 종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) break;
        }
    }
}

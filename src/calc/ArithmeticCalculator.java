package calc;

public class ArithmeticCalculator<T> {

    //속성

    //생성자

    //기능

    /*
     * TODO Enum 타입을 활용하여 사칙연산 계산기 구현
     * TODO double 타입의 값을 전달 받아도 연산 수행 - 제네릭 사용
     * TODO 피연산자를 여러 타입으로 받을 수 있도록 기능 확장
     */

    public <T extends Number> double calculate(T a, T b, char operator) {
        //1. 결과값 선언
        double result = 0;

        //2. 계산하기
        switch (operator) {
            case '+':   //덧셈
                result = a.doubleValue() + b.doubleValue();
                break;
            case '-':   //뺄셈
                result = a.doubleValue() - b.doubleValue();
                break;
            case '*':   //곱셈
                result = a.doubleValue() * b.doubleValue();
                break;
            case '/':   //나눗셈
                result = a.doubleValue() / b.doubleValue();
                break;
        }

        //3. 반환하기
        return result;
    }

    //TODO 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값들을 출력
}

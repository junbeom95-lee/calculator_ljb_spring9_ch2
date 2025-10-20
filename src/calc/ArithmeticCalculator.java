package calc;

public class ArithmeticCalculator<T> {

    //속성

    //생성자

    //기능
    /**
     * 숫자 a와 b, 연산 기호를 받아 Enum에 구현된 메서드를 통해 사칙연산 계산
     * @param a 입력받은 첫 번째 수
     * @param b 입력받은 두 번쨰 수
     * @param operator 사칙연산 기호
     * @return 첫 번째 수와 두 번째 수를 사칙연산에 따라 나온 결과값
     * @param <S> Number 객체나 하위 객체만 가능함
     */
    public <S extends Number> double calculate(S a, S b, char operator) {
        //1. 결과값 선언
        double result = 0;

        //2. 사칙연산 Enum 매핑
        OperatorType operatorType = OperatorType.mappingChar(operator);

        //3. 계산하기
        result = operatorType.apply(a.doubleValue(), b.doubleValue());

        //4. 반환하기
        return result;
    }

    //TODO 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값들을 출력

}

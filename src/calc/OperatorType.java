package calc;

import java.util.function.BiFunction;

public enum OperatorType {

    //TODO 연산 기호 만들기
    SUM('+',(a, b) ->  a + b),
    SUB('-',(a, b) ->  a - b),
    MUL('*',(a, b) ->  a * b),
    DIV('/',(a, b) ->  a / b);

    //속성
    private final char operator;    //매핑하기 위한 속성
    //두 개의 입력(첫 번째, 두 번째)을 받아 결과(세 번째)를 반환하는 함수형 인터페이스
    private final BiFunction<Double, Double, Double> biFunction;

    //생성자
    OperatorType(char operator, BiFunction<Double, Double, Double> biFunction) {
        this.operator = operator;
        this.biFunction = biFunction;
    }

    public BiFunction<Double, Double, Double> getBiFunction() {
        return biFunction;
    }

    //기능
    /**
     * 문자 사칙연산을 Enum으로 바꾸는 메서드
     * @param operator 사칙연산 ex) '+', '-', '*', '/'
     * @return 사칙연산에 해당되는 Enum 상수
     */
    public static OperatorType mappingChar(char operator) {
        for(OperatorType opType : values()) {
            if (opType.operator == operator) {
                return opType;
            }
        }
        return null;
    }
}

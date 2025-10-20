package calc;

public enum OperatorType {

    //TODO 연산 기호 만들기
    SUM('+') {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUB('-') {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MUL('*') {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIV('/') {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    };

    //속성
    private final char operator;

    //생성자
    OperatorType(char operator) {
        this.operator = operator;
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

    /**
     * Enum 상수가 서로 다른 연산을 수행할 수 있도록 익명 클래스 형태 설계
     * @param a 입력받은 수 a
     * @param b 입력받은 수 b
     * @return double형으로 a와 b를 연산한 값
     */
    public abstract double apply(double a, double b);
}

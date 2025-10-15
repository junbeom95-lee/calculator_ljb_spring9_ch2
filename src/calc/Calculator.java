package calc;

import java.util.ArrayList;

public class Calculator {

    //컬렉션 타입의 연산 결과를 저장하는 필드
    private ArrayList<Long> calcResultList = new ArrayList<>();


    /**
     * 두 양의 정수를 받아 계산하고 반환하는 기능
     * @param a 첫 번째 입력받은 값
     * @param b 두 번째 입력받은 값
     * @param operator 연산 기호
     * @return result  a와 b를 연산한 결과값
     */
    public long calculate(long a, long b, char operator) {
        //1. 결과값 선언
        long result = 0;

        //2. 계산하기
        switch (operator) {
            case '+':   //덧셈
                result = a + b;
                break;
            case '-':   //뺄셈
                result = a - b;
                break;
            case '*':   //곱셈
                result = a * b;
                break;
            case '/':   //나눗셈
                result = a / b;
        }

        //3. 반환하기
        return result;
    }

    /* Getter 메서드 구현 */
    public ArrayList<Long> getCalcResultList() {
        return calcResultList;
    }

    /* Setter 메서드 구현 */
    public void setCalcResultList(long result) {
        calcResultList.add(result);
    }

    //TODO 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능
    public void removeResult() {
        /* 구현 */
    }
}

package calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //컬렉션 타입의 연산 결과를 저장하는 필드
    private final List<Long> calcResultList = new ArrayList<>();

    /**
     * 두 양의 정수를 받아 계산하고 컬렉션에 저장하고 반환하는 기능
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
                break;
        }
        //3. 컬렉션에 저장
        addToHistory(result);

        //4. 반환하기
        return result;
    }

    /* Getter 메서드 구현 */
    public List<Long> getCalcResultList() {
        return calcResultList;
    }

    /* Setter 메서드 구현 */
    public void addToHistory(long result) {
        //결과를 저장하는 컬렉션 확인
        if (calcResultList.size() >= 10) {  // 10개 이상 저장되었는지 확인
            calcResultList.remove(0);
        }
        //결과값을 컬렉션에 저장
        calcResultList.add(result);
    }
}

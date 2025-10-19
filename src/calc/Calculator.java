package calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //속성
    private final List<Long> calcResultList = new ArrayList<>();            //결과값을 저장하는 컬렉션
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(); //계산기능을 가지고 있는 클래스

    //생성자

    //기능
    /**
     * 두 양의 정수를 받아 계산하고 컬렉션에 저장하고 반환하는 기능
     * @param a 첫 번째 입력받은 값
     * @param b 두 번째 입력받은 값
     * @param operator 연산 기호
     * @return result  a와 b를 연산한 결과값
     */
    public long calculate(long a, long b, char operator) {
        //1. 계산하기
        long result = arithmeticCalculator.calculate(a, b, operator);

        //2. 계산 이력 저장
        addToHistory(result);

        //3. 반환하기
        return result;
    }

    /* Getter 메서드 구현 */
    public List<Long> getCalcResultList() {
        return calcResultList;
    }

    /**
     * 계산 결과를 10개 이상 저장되면 첫번째꺼 삭제하기
     * 계산 결과를 저장하기
     * @param result 계산 결과값
     */
    public void addToHistory(long result) {
        //결과를 저장하는 컬렉션 확인
        if (calcResultList.size() >= 10) {  // 10개 이상 저장되었는지 확인
            calcResultList.remove(0);
        }
        //결과값을 컬렉션에 저장
        calcResultList.add(result);
    }
}

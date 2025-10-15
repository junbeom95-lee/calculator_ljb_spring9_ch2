package calc;

import java.util.ArrayList;

public class Calculator {

    //컬렉션 타입의 연산 결과를 저장하는 필드
    private ArrayList<Long> calcResultList = new ArrayList<>();

    //TODO 2. calculate 기능 구현
    public long calculate(long a, long b, char operator) {
        long reuslt = 0;

        return reuslt;
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

package calc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T> {

    //속성
    private final List<Double> calcResultList = new ArrayList<>();            //결과값을 저장하는 컬렉션

    //생성자

    //기능
    /**
     * 숫자 a와 b, 연산 기호를 받아 Enum에 구현된 메서드를 통해 사칙연산 계산
     *
     * @param a        입력받은 첫 번째 수
     * @param b        입력받은 두 번쨰 수
     * @param operator 사칙연산 기호
     * @param <S>      Number 객체나 하위 객체만 가능함
     * @return 첫 번째 수와 두 번째 수를 사칙연산에 따라 나온 결과값
     */
    public <S extends Number> double calculate(S a, S b, char operator) {

        //1. 사칙연산 Enum 매핑
        OperatorType operatorType = OperatorType.mappingChar(operator);

        //2. 계산하기
        double result = operatorType.apply(a.doubleValue(), b.doubleValue());   //인라인화 할 수 있지만 안함

        //4. 계산 이력 저장
        addToHistory(result);

        //3. 반환하기
        return result;
    }

    /**
     * 저장된 연산 결과들 중 최근 결과와 비교하여 큰 결과값들을 리스트화
     * @param result 방금 만들어진 따끈따끈한 결과값
     * @return 최근 결과값보다 큰 값들의 리스트
     */
    public List<Double> getBiggerResults(double result) {
        //큰 값 찾기
        List<Double> biggerResults = calcResultList.stream()            //1. 데이터 흐름 준비
                .filter(savedResult -> savedResult > result)     //2. 중간 연산 등록
                .collect(Collectors.toList());                          //3. 최종 연산 하기

        return biggerResults;
    }

    /**
     * 결과값들을 저장하는 리스트를 불러오는 메서드
     * @return 결과값 저장 리스트
     */
    public List<Double> getCalcResultList() {
        return calcResultList;
    }

    /**
     * 계산 결과를 5개 이상 저장되면 첫번째꺼 삭제하기
     * 계산 결과를 저장하기
     * @param result 계산 결과값
     */
    public void addToHistory(double result) {
        //결과를 저장하는 컬렉션 확인
        if (calcResultList.size() >= 5) {  // 10개 이상 저장되었는지 확인
            calcResultList.remove(0);
        }
        //결과값을 컬렉션에 저장
        calcResultList.add(result);
    }
}

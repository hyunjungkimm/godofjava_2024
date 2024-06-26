package chapter13;

public class FinalVariable {
    int instanceVariable;
    final int instanceVariable2 = 2;
    //final int instanceVariable2; -- 에러, 인스턴스 변수, 클래스 변수 : 생성과 동시에 초기화

    // 매개 변수나 지역 변수를 final로 선언하는 경우에는 반드시 선언할 때 초기화할 필요는 없다.
    public void method(final int parameter) {
        final int localVariable;
        localVariable = 2;
        // 매개 변수 : 값이 넘어오기 전에 이미 값을 정해 놨기 때문에, 다시 할당 x
        // parameter = 4;
    }
}

package chapter04;

public class VariableTypes {
    int instanceVariable; // 인스턴스변수
    static int classVariable; // 클래스변수
    public void method(int parameter) { // 매개변수
        int localVariable; // 지역변수
    }
    public void anotherMethod(int parameter) {
        if(true){
            int localVariable;
        }
        if(true) {
            int localVariable;
        }
    }
}

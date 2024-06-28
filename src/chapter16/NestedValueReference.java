package chapter16;

import java.util.EventListener;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;

    //staticNested 클래스 - static 변수만 참조 가능
    static class StaticNested {
        public void setValue() {
            //static으로 선언되어 있어서 부모 클래스에 static하지 않은 변수 참조 불가능
            staticInt = 14;
        }
    }

    //내부 클래스- 감싸고 있는 클래스의 어떤 변수라도 참조 가능
    class Inner {
        public void setValue() {
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }
    //익명 클래스 - 감싸고 있는 클래스의 어떤 변수라도 참조 가능
    public void setValue() {
        EventListener listener = new EventListener() {
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }

}

package chapter16;

public class ReferenceAtNested {
    static class StaticNested {
        private int staticNested = 99;
    }

    class Inner {
        private int inner = 100;
    }
    // 클래스의 객체 생성한 후 그 값을 참조하는 것은 가능함
    //private이어도 접근 가능
    public void setValue(int value) {
        ReferenceAtNested.StaticNested nested = new ReferenceAtNested.StaticNested();
        nested.staticNested = value;
        Inner inner = new Inner();
        inner.inner = value;
    }
}

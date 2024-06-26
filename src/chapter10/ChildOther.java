package chapter10;

public class ChildOther extends Parent {
    public ChildOther() {
        System.out.println("ChildOther constructor");
    }

    @Override
    public void printName() {
        System.out.println("ChildOther - printName()");
    }
}

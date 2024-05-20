package chapter08;

public class ReferenceStatic {
    static String name;

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public static void staticMethodCallVariable(){
        System.out.println(name);
    }
}

package chapter05;

public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound sample = new OperatorCompound();
        sample.additive();
    }

    public void additive() {
        int intValue = 10;
        System.out.println(intValue += 5);
        System.out.println(intValue -= 5);
        System.out.println(intValue *= 5);
        System.out.println(intValue /= 5);
        System.out.println(intValue %= 5);
    }
}

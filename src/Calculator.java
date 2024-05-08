public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator class started");
    }
    public int add(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }
    public int subtract(int num1, int num2) {
        int minus;
        minus = num1 - num2;
        return minus;
    }

    public int multiply(int num1, int num2) {
        int multiply;
        multiply = num1 * num2;
        return multiply;
    }

    public int divide(int num1, int num2) {
        int divide;
        divide = num1 / num2;
        return divide;
    }
}

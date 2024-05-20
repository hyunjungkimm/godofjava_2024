package chapter08;

public class MethodVarargs {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO("Sangmin", "0109999999", "dsf@gmail.com");
        System.out.printf("Name:%s Phone:%s email:%s\n", memberDTO.name, memberDTO.phone, memberDTO.email);
        MethodVarargs methodVarargs = new MethodVarargs();
        methodVarargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        methodVarargs.calculateNumbers(1,2,3,4,5);
    }

    public void calculateNumbersWithArray(int[] numbers) {

    }

    public void calculateNumbers(int...numbers) {
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        System.out.println("Total = " +total);
    }
}

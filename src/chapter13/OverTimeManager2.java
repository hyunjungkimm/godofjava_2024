package chapter13;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 values2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(values2);
        System.out.println(values2.getAmount());

        OverTimeValues2[] values3 = OverTimeValues2.values();
        for(OverTimeValues2 value : values3) {
            System.out.println(value);
        }
    }
}

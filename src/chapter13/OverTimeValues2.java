package chapter13;

public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);

    private final int amount;
    //enum 생성자 - package-private, private 만 접근 제어자로 사용할 수 있음 (각 상수를 enum 클래스 내에서 선언할 때에만 생성자 사용 가능)
    OverTimeValues2(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

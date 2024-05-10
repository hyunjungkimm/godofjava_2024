package chapter06;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();
        controlWhile.whileLoop();
    }

    public void whileLoop() {
        ControlOfFlow controlOfFlow = new ControlOfFlow();
        int loop = 0;
        while(loop < 12) {
            loop++;
            controlOfFlow.switchCalendar(loop);
        }
    }
}

package chapter06;

public class ControlSwitch {
    public static void main(String[] args) {
        ControlSwitch cs = new ControlSwitch();
        cs.swtichStatement(1);
        cs.swtichStatement(2);
        cs.swtichStatement(3);
        cs.swtichStatement(4);
        cs.swtichStatement(6);
    }

    public void swtichStatement(int numberOfWheel) {
        switch(numberOfWheel) {
            case 1 :
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                break;
            case 2 :
                System.out.println(numberOfWheel + ": It is two foot bicycle");
                break;
            case 3 :
                System.out.println(numberOfWheel + ": It is three foot bicycle");
                break;
            case 4 :
                System.out.println(numberOfWheel + ": It is four foot bicycle");
                break;
            default:
                System.out.println(numberOfWheel + ": It is an expensive car");
                break;
        }
    }
}

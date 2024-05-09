package chapter04;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes type = new PrimitiveTypes();
        type.checkByte();
        type.checkOtherTypes();
        type.checkChar();
        type.checkBoolean();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin: " + byteMin);
        System.out.println("byteMax: " + byteMax);
        byteMin = (byte)(byteMin - 1);
        byteMax = (byte)(byteMax + 1);
        System.out.println("byteMin - 1: " + byteMin);
        System.out.println("byteMax - 1: " + byteMax);
    }

    public void checkOtherTypes() {
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("shortMax: " + shortMax);
        System.out.println("intMax: " + intMax);
        System.out.println("longMax: " + longMax);
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin=[" + charMin + "]");
        System.out.println("charMax=[" + charMax + "]");
        int intValue = 'a';
        System.out.println("intValue=[" + intValue + "]");
    }

    public void checkBoolean() {
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }

    int intDefault1;
    public void defaultValues() {
        int intDefault2;
        System.out.println(intDefault1);
        //System.out.println(intDefault2);
    }
}

package chapter15;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        sample.convertUTF16();
        sample.checkCompare();
    }

    public void convert() {
        try {
            String korean ="한글";
            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void convertUTF16() {
        try {
            String korean ="한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1,"UTF-16");
            System.out.println(korean2);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";
        String text3 = new String("Check value");

        if(text == text2) {
            System.out.println("text == text2 same");
        }else {
            System.out.println("text == text2 different");
        }

        if(text.equals("Check value")) {
            System.out.println("text == text2 same");
        }

        if(text == text3) {
            System.out.println("text == text3 same");
        }else {
            System.out.println("text == text3 different");
        }


        if(text3.equals("Check value")) {
            System.out.println("text == text3 same");
        }
    }

    public void printByteArray(byte[] array) {
        for(byte data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }


}

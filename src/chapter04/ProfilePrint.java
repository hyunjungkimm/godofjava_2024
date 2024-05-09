package chapter04;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint print = new ProfilePrint();
        print.setAge((byte) 29);
        print.setName("KIM");
        print.setMarried(false);
        System.out.println("Age: " + print.age);
        System.out.println("Name: " + print.name);
        System.out.println("Married: " + print.isMarried);
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge(byte age) {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean isMarried() {
        return isMarried;
    }


}

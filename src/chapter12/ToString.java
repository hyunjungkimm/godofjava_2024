package chapter12;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
    }

    private void toStringMethod(ToString obj) {
        //현재 클래스의 패키지 이름.클래스이름@객체의 해쉬코드 값
        //chapter12.ToString@2a84aee7
        System.out.println(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        System.out.println(obj);
        System.out.println(obj.toString());

        //자기 자신을 의미하는 this - 매개변수 넘겨줄 필요 없음
        System.out.println(this); //chapter12.ToString@2a84aee7
        System.out.println(this.toString()); //chapter12.ToString@2a84aee7

        //plus chapter12.ToString@2a84aee7
        System.out.println("plus " + obj);
        System.out.println("plus " + this);
    }
}

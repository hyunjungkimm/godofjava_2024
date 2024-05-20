package chapter08;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass pass = new ReferencePass();
        pass.callPassByValue();
        pass.callPassByReference();
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("Sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name = " + member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name = " + member.name);
    }

    public void passByReference(MemberDTO member) {
        member.name = "Sungchoon";
        System.out.println("in passByReference");
        System.out.println("member.name = " + member.name);
    }

    public void callPassByValue() {
        int a =10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a,b);
        System.out.println("after passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

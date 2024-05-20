package chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor ref = new ReferenceConstructor();
        ref.makeMemberObject();
    }

    public void makeMemberObject(){
        MemberDTO member = new MemberDTO();
        MemberDTO member2 = new MemberDTO("Sangmin");
        MemberDTO member3 = new MemberDTO("Sangmin", "010000000");
        MemberDTO member4 = new MemberDTO("Sangmin", "010000000", "xxx@gmail.com");
    }
}

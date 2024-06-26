package chapter13;

import java.lang.reflect.Member;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(Member member);
    public abstract boolean removeMember(Member member);
    public abstract boolean updateMember(Member member);
    public void printLog(String data) {
        System.out.println("Data = " + data);
    }
}

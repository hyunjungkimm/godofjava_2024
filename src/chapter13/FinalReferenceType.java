package chapter13;

import chapter12.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
       FinalReferenceType finalReferenceType = new FinalReferenceType();
       finalReferenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
        //기본자료형과 마찬가지로 참조 자료형도 두 번 이상 할당하거나 새로 생성자를 사용하여 초기화할 수 없음
        //dto = new MemberDTO();
        dto.name = "Sangmin";
        System.out.println(dto);
    }
}

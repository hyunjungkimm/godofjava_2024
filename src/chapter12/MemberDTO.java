package chapter12;

import java.util.Objects;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {}
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return "Name = " + name + ", phone = " + phone + ", email = " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return Objects.equals(name, memberDTO.name) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, email);
    }

    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO("kim", "010", "gmail@gmail.com");
        System.out.println("Name = " + memberDTO.name + ", phone = " + memberDTO.phone + ", email = " + memberDTO.email);
        System.out.println(memberDTO);

        MemberDTO memberDTO1 = new MemberDTO("kim", "010", "gmail@gmail.com");

        if(memberDTO == memberDTO1) {
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        if(memberDTO.equals(memberDTO1)) {
            System.out.println("same");
        }else {
            System.out.println("different");
        }
    }
}

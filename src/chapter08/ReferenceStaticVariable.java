package chapter08;

public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable() {

    }
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable referenceStaticVariable = new ReferenceStaticVariable();
        referenceStaticVariable.checkName();
    }

    public void checkName() {
        ReferenceStaticVariable referenceStaticVariable1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(referenceStaticVariable1.name);
        ReferenceStaticVariable referenceStaticVariable2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(referenceStaticVariable1.name);
    }
}

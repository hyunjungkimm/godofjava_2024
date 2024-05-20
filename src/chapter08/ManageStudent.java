package chapter08;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }

    public Student[] addStudent() {
        Student [] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Mike");
        students[2] = new Student("John","Seoul","01011111111", "ask@gmail.com");
        return students;
    }

    public void printStudents(Student ... student) {
        for(Student students : student) {
            System.out.println(students);
        }
    }
}

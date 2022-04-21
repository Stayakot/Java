package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Pasha","Psihilog");
        Teacher teacher = new Teacher("Gena Petrovich", "Psihiligia");

        System.out.println(student.groupName);
        System.out.println(teacher.subjectName);

        student.printInfo();
        teacher.printInfo();

    }
}



import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group1 group1 = new Group1();
        StudentsGroup groupNew = group1.getStudentGroup1();

        for(Student student: groupNew.getStudentList())

        {
            System.out.println(student.getName());

        }

    }
}
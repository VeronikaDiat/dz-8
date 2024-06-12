import java.util.ArrayList;
import java.util.List;

public class Group1 {

    public StudentsGroup getStudentGroup1() {
        return StudentGroup1;
    }

    public void setStudentGroup1(StudentsGroup studentGroup1) {
        StudentGroup1 = studentGroup1;
    }

    private StudentsGroup StudentGroup1;

    public Group1(){
        // Create students
        Student headman = new Student(1, "John", "Doe");

        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"Jane","Smith"));
        students.add(new Student(3,"Mike","Johnson"));

        // Create tasks
        List<String> tasks = new ArrayList<>();
        tasks.add("Math Assignment");
        tasks.add("Science Project");

        StudentGroup1  = new StudentsGroup(headman, students, tasks);


    }


}

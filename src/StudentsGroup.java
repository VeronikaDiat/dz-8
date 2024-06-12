import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student headman;
    private List<Student> studentList;
    private List<String> taskList;
    private boolean isTaskCompleted;

 public StudentsGroup(Student headman, List<Student> studentList, List<String> taskList){
     this.headman =  headman;
     this.studentList = studentList;
     this.taskList = taskList;
 }


    public Student getHeadman() {
        return headman;
    }

    public void setHeadname(Student headname) {
        this.headman = headname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<String> getTasklist() {
        return tasklist;
    }

    public void setTasklist(List<String> tasklist) {
        this.tasklist = tasklist;
    }

    private List<String> tasklist;

    public StudentsGroup(Student headman, List<String> taskList) {
        this.taskList = taskList;
        if (headman == null) {
            System.out.println("Headman cannot be null");
        }
    }
    public void NewHeadman(Student headman){
        this.headman =  headman;

        if(!studentList.contains(headman)){
            System.out.println("New headman must be a member of the student list");
        }
    }
    public void addStudent (Student student){
        studentList.add(student);
    }

    public void removeStudent (Student student){
        studentList.remove(student);
        if (student.equals(this.headman)){
            System.out.println("Cannot remove the headman from the group");
        }

    }

    public void addTask(String task){
        taskList.add(task);

    }
    public void MarkAsCompleted(Student student,String task){
        if (task!= null){
            isTaskCompleted = true;
            System.out.println(true);
        }
    }
}


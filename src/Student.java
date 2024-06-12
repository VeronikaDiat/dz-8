public class Student {
    private int StudentNumber;
    private String Name;
    private String Surname;

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Student(int  StudentNumber, String Name, String Surname){
        this.StudentNumber= StudentNumber;
        this.Name = Name;
        this.Surname = Surname;
    }
}
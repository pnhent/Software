public class Student 
{
    private StudentInterface studentInterface;

    public Student(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    public void registerForCourse() {
        studentInterface.registerCourse();
    }

    public void checkGrades() {
        studentInterface.viewGrades();
    }
}
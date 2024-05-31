public class Professor 
{
    private ProfessorInterface professorInterface;

    public Professor(ProfessorInterface professorInterface) {
        this.professorInterface = professorInterface;
    }

    public void registerStudentGrades() {
        professorInterface.registerGrades();
    }

    public void checkAttendance() {
        professorInterface.viewAttendance();
    }
}

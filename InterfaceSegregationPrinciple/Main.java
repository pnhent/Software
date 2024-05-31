public class Main 
{
    public static void main(String[] args) 
    {
        SchoolManage schoolManagement = new SchoolManage();

        Student student = new Student(schoolManagement);
        student.registerForCourse();
        student.checkGrades();

        Professor professor = new Professor(schoolManagement);
        professor.registerStudentGrades();
        professor.checkAttendance();

        Worker worker = new Worker(schoolManagement);
        worker.configureCourseRegistrationPeriod();
        worker.configureGradeViewingPeriod();
    }
}

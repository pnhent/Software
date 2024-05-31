public class SchoolManage implements StudentInterface, ProfessorInterface, WorkerInterface 
{
    @Override
    public void registerCourse() {
        System.out.println("학생이 수강 신청을 했습니다.");
    }

    @Override
    public void viewGrades() {
        System.out.println("학생이 성적을 조회했습니다.");
    }

    @Override
    public void registerGrades() {
        System.out.println("교수가 성적을 등록했습니다.");
    }

    @Override
    public void viewAttendance() {
        System.out.println("교수가 출석부를 조회했습니다.");
    }

    @Override
    public void setCourseRegistrationPeriod() {
        System.out.println("직원이 수강 신청 기간을 설정했습니다.");
    }

    @Override
    public void setGradeViewingPeriod() {
        System.out.println("직원이 성적 조회 기간을 설정했습니다.");
    }
}
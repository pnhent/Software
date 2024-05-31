public class Main {
    public static void main(String[] args) {
        Grade manager = new Grade();

        Course course1 = new Course("CS101", "과학의 소개", "월 9-11");
        Course course2 = new Course("MATH101", "미적분 I", "수 10-12");

        manager.addCourse(course1);
        manager.addCourse(course2);

        manager.enrollStudent("홍길동", "CS101");
        manager.enrollStudent("홍길동", "MATH101");

        manager.assignGrade("홍길동", "CS101", 95.0);
        manager.assignGrade("홍길동", "MATH101", 88.0);

        System.out.println("학생 시간표:");
        for (Course course : manager.getStudentTimetable("홍길동")) {
            System.out.println(course.getTitle() + " - " + course.getTime());
        }

        System.out.println("\n학생 성적:");
        for (Course course : manager.getGrades("홍길동")) {
            System.out.println(course.getTitle() + " - 성적: " + (course.getGrade() >= 0 ? course.getGrade() : "등록되지 않았습니다."));
        }
    }
}
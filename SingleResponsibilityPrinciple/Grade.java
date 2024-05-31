import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grade 
{
    private List<Course> courses = new ArrayList<>();
    private Map<String, List<Course>> enrollments = new HashMap<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudent(String studentId, String courseCode) {
        Course course = findCourseByCode(courseCode);
        if (course != null) {
            enrollments.computeIfAbsent(studentId, k -> new ArrayList<>()).add(course);
        }
    }

    public List<Course> getStudentTimetable(String studentId) {
        return enrollments.getOrDefault(studentId, new ArrayList<>());
    }

    public void assignGrade(String studentId, String courseCode, double grade) {
        List<Course> studentCourses = enrollments.get(studentId);
        if (studentCourses != null) {
            for (Course course : studentCourses) {
                if (course.getCode().equals(courseCode)) {
                    course.setGrade(grade);
                    break;
                }
            }
        }
    }

    public List<Course> getGrades(String studentId) {
        return enrollments.getOrDefault(studentId, new ArrayList<>());
    }

    private Course findCourseByCode(String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }
}

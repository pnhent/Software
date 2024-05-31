public class Course {
    private String code;
    private String title;
    private String time;
    private double grade;

    public Course(String code, String title, String time) {
        this.code = code;
        this.title = title;
        this.time = time;
        this.grade = -1.0;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
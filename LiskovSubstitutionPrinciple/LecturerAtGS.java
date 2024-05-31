public class LecturerAtGS extends Lecturer
{
    public LecturerAtGS()
    {
        lecturer = "대학원 강사";
    }

    public void Lecturer()
    {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge*2 + "원\n");
    }
}

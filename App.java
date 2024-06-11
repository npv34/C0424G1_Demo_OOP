import src.Student;
import src.StudentManager;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kien", "kien@gmail.com", 3.4, "09989899");
        Student s2 = new Student(2, "Manh", "manh@gmail.com", 3.4, "09989899");

        StudentManager studentManager = new StudentManager(10);
        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.showStudent();

        /* BTVN:
        * 1: Xay dung ung co chuc nang: them, sua, xoa sinh vien nhap tu ban phim
        *  */
    }
}

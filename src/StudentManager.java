package src;

public class StudentManager {
    protected Student[] listStudent;
    protected int limit;
    protected int size;

    public StudentManager(int limit) {
        this.listStudent = new Student[limit];
        this.limit = limit;
        this.size = 0;
    }

    public void addStudent(Student student) {
        if (this.size == this.limit) {
            System.out.println("Student full");
        } else {
            listStudent[this.size] = student;
            this.size++;
        }
    }

    public void showStudent() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(listStudent[i]);
        }
    }
}

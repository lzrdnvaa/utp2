abstract class Student {
    String fullName;
    int course;
    int examGrade;

    public Student(String fullName, int course, int examGrade) {
        this.fullName = fullName;
        this.course = course;
        this.examGrade = examGrade;
    }

    public abstract void writeExam();
}

class IUStudent extends Student {
    public IUStudent(String fullName, int course, int examGrade) {
        super(fullName, course, examGrade);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент направления Информатика " + fullName + " пишет экзамен.");
    }
}

class MathStudent extends Student {

    public MathStudent(String fullName, int course, int examGrade) {
        super(fullName, course, examGrade);
    }

    @Override
    public void writeExam() {
        System.out.println("Студент направления Математика " + fullName + " пишет экзамен.");
    }
}


public class Main {
    public static void main(String[] args) {
        IUStudent iuStudent = new IUStudent("Иван Иванов", 3, 90);
        MathStudent mathStudent = new MathStudent("Петр Петров", 2, 75);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}
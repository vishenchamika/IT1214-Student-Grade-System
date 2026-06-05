public class Student {

    private int studentID;
    private String studentName;
    private double marks;

    public Student(int studentID, String studentName, double marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void displayStudent() {
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}
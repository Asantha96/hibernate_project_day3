package entity;

import javax.persistence.*;

@Entity(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    private String studentName;

    //........................mapping.....................
    @OneToOne(cascade = CascadeType.ALL)//parent class(base class)
    @JoinColumn(name = "laptop_id") //that means adding a column to the student table
    private Laptop laptop;//this laptop name take as the mapped by laptop class
    //........................mapping.....................


    public Student() {
    }

    public Student(long studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}

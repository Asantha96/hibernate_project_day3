import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();

            Laptop laptop= new Laptop();
            laptop.setBrand("lenovo");
            //session.save(laptop);

            Student student =new Student() ;
            student.setStudentName("Lakmal");
            student.setLaptop(laptop);
            session.save(student);

            transaction.commit();

        }
    }
}

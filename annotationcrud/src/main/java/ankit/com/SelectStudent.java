package ankit.com;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class SelectStudent{
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Scanner scn = new Scanner(System.in);

        // METHOD 1

        // System.out.println("Enter student name");
        //crud st = (newStudent) session.load(newStudent.class,scn.nextLine());
        //System.out.println("Student roll is:" + st.getId());
        //System.out.println("Student name is:" + st.getName());
        //System.out.println("Student cgpa is:" + st.getCity());


        //Method 2

        System.out.println("Enter student id");
        newStudent st = (newStudent) session.get(newStudent.class,scn.nextInt());
        System.out.println("Student roll is:" + st.getId());
        System.out.println("Student name is:" + st.getName());
        System.out.println("Student cgpa is:" + st.getCity());


    }
}

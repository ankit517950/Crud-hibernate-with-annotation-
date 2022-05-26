package ankit.com;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main(String[] args)
    {
        Configuration confg = new Configuration().configure("hibernate.cfg.xml");
//        .addAnnotatedClass(crud.class)
        SessionFactory sf = confg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txn;
        String choice = "no";
        Scanner scn = new Scanner(System.in);

        do

        {
            txn = session.beginTransaction();

            newStudent st = new newStudent();
            System.out.println("enter student name");
            st.setName(scn.nextLine());
            System.out.println("enter student id");
            st.setId(scn.nextInt());
            System.out.println("enter student city");
            st.setCity(scn.next());
            session.save(st);
            txn.commit();
//            session.flush();
            System.out.println("one record inserted succesfully");
            System.out.println("Do you want to insert new student record");
            choice = scn.next();
            scn.nextLine();
        }
        while(choice.equalsIgnoreCase("y") | choice.equalsIgnoreCase("yes"));
        session.close();
        sf.close();

    }
}




















































































/*
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml").addAnnotatedClass(newStudent.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        //Creating Student
        newStudent st = new newStudent();
        st.setId(104);
        st.setName("ak");
        st.setCity("Bijnor");
        System.out.println(st);




        session.save(st);
        txn.commit();
       session.close();
    }
}
*/
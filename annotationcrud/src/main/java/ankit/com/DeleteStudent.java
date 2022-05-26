package ankit.com;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {

        Configuration confg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = confg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txn = session.beginTransaction();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter studentid to delete a record");
        newStudent st = (newStudent) session.get(newStudent.class,scn.nextInt());
        if(st != null)
        {

            session.delete(st);
            session.flush();
            txn.commit();
            System.out.println("One record update succesfully");

        }
        else
        {
            System.out.println("Record not found please enter correct information ");
        }
        session.close();
        sf.close();
    }
}

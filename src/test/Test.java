package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {

	public static void main(String[] args){
		SessionFactory sessfact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session sess = sessfact.openSession();
		Student st = new Student();
		st.setName("Sneha Dabral");
		st.setAddress("Sarojini Nagar");
		
		sess.beginTransaction();
		sess.persist(st);
		sess.getTransaction().commit();
		
		System.out.println("Ho gaya ho main");
	}

}

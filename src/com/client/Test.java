package com.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
	Scanner sc=new Scanner(System.in);
	
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	Student s=new Student();
	
	System.out.println("Enter The Rollno Of Student");
	//s.setRollno(56);
	s.setRollno(sc.nextInt());
	
    System.out.println("Enter The Name Of Student");
	//s.setName("junior");
    s.setName(sc.next());
	
	System.out.println("Enter A Choice To Call Hibernate Operations");
	
	int choice=sc.nextInt();
	
	switch(choice) {
	
	
	case 1:
	{

		session.save(s);
		session.beginTransaction().commit();
		break;
	}
	
	
	case 2:
	{
	Student s1=	session.get(Student.class, 4);
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		break;
	}
	
	case 3:
	{
	Student s2=	session.load(Student.class, 4);
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		break;
	}
	default:
	{
		System.out.println("Invalid Method Calling");
	}
	}
	
	}

}




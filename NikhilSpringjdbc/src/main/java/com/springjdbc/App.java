package com.springjdbc;

import java.sql.BatchUpdateException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student1;

public class App 
{
    public static void main( String[] args )
    {
        
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
    StudentDao template =(StudentDao) context.getBean("StudentDao");
    	
    //Create Table
//    Student1 student1 = new Student1();
//    int create = template.create(student1);
//    System.out.println("Table is Created Successfully...");
    
    //Insert Values
    
//    Student1 student1 = new Student1();
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Id is ");
//    int id=sc.nextInt();
//    
//    System.out.println("Enter Name ");
//    String name=sc.next();
//    
//    System.out.println("Enter City");
//    String city=sc.next();
//    
//    student1.setId(id);
//    student1.setName(name);
//    student1.setCity(city);
//    
//    int insert = template.insert(student1);
//    System.out.println("Value is Inserted in Table...."+insert);
    
    //update
    
//    Student1 student1 = new Student1();
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Id is ");
//  int id=sc.nextInt();
//  
//  System.out.println("Enter Name ");
//  String name=sc.next();
//  
//  System.out.println("Enter City");
//  String city=sc.next();
//  
//  student1.setId(id);
//  student1.setName(name);
//  student1.setCity(city);
//  
//  int update = template.update(student1);
//  System.out.println("value is Updated..."+update);
    
    //delete
    
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter ur id");
//    int id=sc.nextInt();
//    
//    int delete = template.delete(id);
//    System.out.println("Table Value is Deleted Suucessfully..."+delete);
    
    //GetStudent
//    Student1 student = template.getStudent(1);
//    System.out.println("Student is "+student);
    
    //GetMultiple Result
    
    List<Student1> allStudent = template.getAllStudent();
//    System.out.println("All Students is "+allStudent);
    for(Student1 stud:allStudent) {
    	System.out.println("Id is "+stud.getId()+" Name is "+stud.getName() +" City is "+stud.getCity());
    }
    
    }
    
}

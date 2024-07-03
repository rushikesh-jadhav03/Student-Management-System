package com.studentmanagement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
     
	
      //1. Add Student
      public static Student addStudent() {
    	  Scanner sc =new Scanner(System.in);
          Student s=new Student();
    	  System.out.print("Please enter Student Id: ");
		s.setsId(sc.nextInt());
		
		System.out.print("Please enter Student Name: ");
		s.setName(sc.next());
		
		System.out.print("Please enter Student Age: ");
		s.setAge(sc.nextInt());

		return s;
		
	}
      //2.Update Student
      public static void updatestudent(List<Student> students) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Please Enter Updating Details: ");
    	  System.out.println("Please enter Student Id: ");
    	  int id=sc.nextInt();
    	  
    	  System.out.println("Please Enter updating Name: ");
    	  String name=sc.next();
    	  
    	  System.out.println("Please enter updating Age: ");
    	  int age=sc.nextInt();
    	  
    	  int count=0;
    	  for(Student s:students) {
    		 if(id==s.getsId()) {
    			 break;
    		 }
    		 count++;
    	  }
    	  students.get(count).setName(name);
    	  students.get(count).setAge(age);
		
    	  
      }
      //3.Display All Student
      public static void displayAllStudent(List<Student> students) {
    	    if (students.isEmpty()) {
    	        System.out.println("No students found.");
    	    } else {
    	        System.out.println("List of Students:");
    	        for (Student s : students) {
    	            System.out.println(s.toString());
    	        }
    	    }
    	}

    
    	 
      
      //4.Delete Student
      public static  void deleteStudent(List<Student> students,int sid) {
    	  Iterator<Student> studentIterator=students.iterator();
    	 while(studentIterator.hasNext()) {
    		 Student s=studentIterator.next();
    		 if(s.getsId()==sid) {
    			 studentIterator.remove();
    		 }
    	 }
      }
}

package com.studentmanagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> studentlist=new ArrayList<>();
		while(true) {
			System.out.println("\t\tStudent Management System");
			System.out.println(" ============================================================================ ");
			System.out.println("1.Add Student");
			System.out.println("2.Update Student");
			System.out.println("3.Display All Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");
			System.out.print("Enter number for operation:");
			int option=sc.nextInt();
			switch (option) {
			case 1:
				//Add Student
				Student scc=StudentUtility.addStudent();
				studentlist.add(scc);
				System.out.println("Student Added Successfully.");
				break;
			case 2:
				//Update Student
				StudentUtility.updatestudent(studentlist);
				System.out.println("Student Updated Successfully.");
				break;
			case 3:
				//Display All Student
				StudentUtility.displayAllStudent(studentlist);
				break;
			case 4:
				//Delete Student
				System.out.println("Please Enter Id ");
				int sid=sc.nextInt();
				StudentUtility.deleteStudent(studentlist, sid);
				System.out.println("Student Deleted Successfully.");
				break;
				
			case 5:
				//Exit From execution
				System.exit(0);
					break;

			default:
				System.err.println("Please Enter valid option");
			}
		}

	}

}

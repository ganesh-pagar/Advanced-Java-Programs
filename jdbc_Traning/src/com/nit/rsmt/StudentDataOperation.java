package com.nit.rsmt;

import java.util.Scanner;

public class StudentDataOperation
{

	public static void main(String[] args)
	{
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Press 1 Insert data ");
	  System.out.println("Press 2 deleting data "); 	  
	  System.out.println("Press 3 updating data  "); 	  
	  System.out.println("Press 5 for exit");
	  int choice=scn.nextInt();
	  switch(choice)
	  {
	  case 1 :
		  System.out.println("Enter student name ");
		  String name = scn.nextLine();
		  
		  System.out.println("Enter student id ");
		  int id =scn.nextInt();
		  scn.nextLine();
		  
		  Student s = new Student(name, id, name, name);
		  boolean added = StudentDataFunctionality.insertData(s);
		  if (added)
		  {
			  System.out.println("Data Added in the db");
			  System.out.println(s);
			  
		  }
		  else
		  {
			  System.out.println("failed to add data !!");
		  }
		  
		  break ;
	  }
	scn.close();
	}

}

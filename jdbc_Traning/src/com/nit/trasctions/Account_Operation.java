package com.nit.trasctions;

import java.util.Scanner;

public class Account_Operation 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Press 1 for deposit and withdraw the money");
		System.out.println("Press 2 for insert the detail");
		System.out.println("Press 3 for view the account info");
		 System.out.println("Press 4 for exit");
		 int choice= scn.nextInt();
		 switch(choice)
		 {
		 case 1 :
			 System.out.println("Enter the amount to be deposit:");
			 double  nu=scn.nextDouble();
			 
         System.out.println("Enter the account number:");
         int  number = scn.nextInt();
         
         System.out.println("Enter the amount to be withdraw:");
         double amounts = scn.nextDouble();
         
         System.out.println("Enter the account number:");
         int acNum=scn.nextInt();
         
         
         
			 break;
			 
		 case 2 :
			 
			 break ;
			 
		 case 3 :
			 
			 break ;
			 
		 case 4:
			 break ;
			 
			 
		 }
	}

}

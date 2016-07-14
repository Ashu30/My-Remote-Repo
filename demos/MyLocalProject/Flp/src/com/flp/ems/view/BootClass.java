package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	Scanner bc =new Scanner(System.in);

	public void menuSelection()
	 {
	int ch;
	System.out.println("Enter your choice:\n 1:Add Employee\n 2:Modify Employee\n 3:Remove Employee\n 4:Search Employee\n 5:getAllEmployee");
	ch=bc.nextInt();
			switch(ch)
	      {
			
	         case 1 :System.out.println("Add Employee");
	         UserInteraction u;
             u=new UserInteraction();
              u.AddEmployee();
	            break;
	         case 2 :System.out.println("Modify Employee");
	         	break;
	         case 3 :
	            System.out.println("Remove Employee");
	            break;
	         case 4 :
	            System.out.println("Search Employee");
	         case 5 :
	            System.out.println("getAllEmployee");
	            break;
	         default :
	            System.out.println("Invalid Selection");
	      }
	 //     System.out.println("Your grade is " + grade);
	   }
	
   public static void main(String[] args) {
	   
	   BootClass b;
	   b=new BootClass();
	   b.menuSelection();

	
   }
	 }



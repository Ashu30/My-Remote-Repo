package com.flp.ems.view;
import java.util.Scanner;
import com.flp.ems.util.DateVal;
import java.util.HashMap;
import java.util.Map;
public class UserInteraction {
	HashMap<String,String> hmap=new HashMap<String,String>();
	String  Emp_id,Kin_id,d,m,y,Dept_id,Proj_id,Roles_id,Name,email,addr,ph_No;
	

	Scanner ui =new Scanner(System.in);
	
	DateVal dv=new DateVal();
	
	public void AddEmployee()
	 {
		
		System.out.println("Enter the Employee Id");
		Emp_id=ui.next();
		
		
		System.out.println("\nEnter the Name");
		Name=ui.next();
		
		System.out.println("\nEnter the Kin Id");
		Kin_id=ui.next();
		
		System.out.println("\nEnter the Email Id");
		email=ui.next();
		
		System.out.println("\nEnter the Phone No");
		ph_No=ui.next();
		
		System.out.println("\nEnter the Date of Birth");
		String Dob = ui.next();
		boolean fdb=dv.valid_Date(Dob);
		/*   EnterDate ed;
		    ed=new EnterDate();
		    ed.getDate();
		  		if(dv.Validation(ed.d,ed.m,ed.y))
		{
			System.out.println("Valid Date");
		}
		else{
			System.out.println("InValid Date");
			}*/
		
		System.out.println("\nEnter the Date of Joining");
		String Doj = ui.next();
		boolean fdj=dv.valid_Date(Doj);
		
	/*	    ed=new EnterDate();
		    ed.getDate();
		if(dv.Validation(ed.d,ed.m,ed.y))
		{
			System.out.println("Valid Date");
		}
		else{
			System.out.println("InValid Date");
			}
		*/
		System.out.println("\nEnter the Adress");
		addr=ui.next();
		
		System.out.println("\nEnter the Department Id");
		Dept_id=ui.next();
		
		System.out.println("\nEnter the project Id");
		Proj_id=ui.next();
		
		System.out.println("\nEnter the Roles Id");
		Roles_id=ui.next();
		
	 
	if(fdb&&fdj)
	{
		System.out.println("Valid Date");
		hmap.put("Emp_id", Emp_id);
		hmap.put("Name", Name);
		hmap.put("Kin_id", Kin_id);
		hmap.put("email", email);
		hmap.put("ph_No", ph_No);
		hmap.put("Dob", Dob);
		hmap.put("Doj", Doj);
		hmap.put("addr", addr);
		hmap.put("Dept_id", Dept_id);
		hmap.put("proj_id", Proj_id);
		hmap.put("roles_id", Roles_id);
		
	}
	else
	{  	System.out.println("Please Enter Valid Date");
	}
  }
 }

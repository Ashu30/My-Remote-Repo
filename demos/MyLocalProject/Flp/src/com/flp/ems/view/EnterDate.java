package com.flp.ems.view;

import java.util.Scanner;
public class EnterDate {

	Scanner dt= new Scanner(System.in);
	int d,m,y;
	public void getDate()
	{
		System.out.println("Enter the date, month and year\n");
		d=dt.nextInt();
		m=dt.nextInt();
		y=dt.nextInt();
	}
}

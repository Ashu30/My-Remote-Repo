package com.flp.ems.domain;

public class Employee {
	private String Emp_id;
	private String Name;
	private int Kin_Id;
	private String email;
	private String ph_No;
	private String Dob;
	private String Doj;
	private String addr;
	private String Dept_Id;
	private String Proj_Id;
	private String Roles_Id;
	
	public String getEmp_id(){
		return Emp_id;
	}
	public void setEmp_id(String emp_id){
		Emp_id=emp_id;
	}
	
	public String getName(){
		return Name;
	}
	public void setName(String name){
		Name=name;
	}
	
	public int getKin_Id(){
		return Kin_Id;
	}
	public void setKin_Id(int kin_Id){
		Kin_Id=kin_Id;
	}
	
	public String getemail(){
		return email;
	}
	public void setemail(String email_Id){
		email=email_Id;
	}
	
	public String getph_No(){
		return ph_No;
	}
	public void setph_No(String phone_No){
		ph_No=phone_No;
	}
	public String getDob(){
		return Dob;
	}
	public void setDob(String dob){
		Dob=dob;
	}
	public String getDoj(){
		return Doj;
	}
	
	public void setDoj(String doj){
		Doj=doj;
	}
	public String getaddr(){
		return addr;
	}
	public void setaddr(String address){
		addr=address;
	}
	public String getDept_Id(){
		return Dept_Id;
	}
	public void setDept_Id(String dept_Id){
		Dept_Id=dept_Id;
	}
	public String getProj_Id(){
		return Proj_Id;
	}
	public void setProj_Id(String proj_Id){
		Proj_Id=proj_Id;
	}
	public String getRoles_Id(){
		return Roles_Id;
	}
	public void setRoles_Id(String roles_Id){
		Roles_Id=roles_Id;
	}
	
}

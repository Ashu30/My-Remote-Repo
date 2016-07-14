package com.flp.ems.service;

import java.util.Map;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService {

	EmployeeServiceImpl esl=new EmployeeServiceImpl();
	Employee ep=new Employee();
	Department dp=new Department();
	Project pj=new Project();
	Role rl=new Role();
	
	UserInteraction i=new UserInteraction();
/*
	@Override*/
	public void AddEmployee(Map hmap) {
		ep.setEmp_id((String)hmap.get("Emp_id"));
		ep.setName((String)hmap.get("Name"));
		ep.setKin_Id((int)hmap.get("Kin_Id"));
		ep.setemail((String)hmap.get("email"));
		ep.setph_No((String)hmap.get("ph_No"));
		ep.setDob((String)hmap.get("Dob"));
		ep.setDoj((String)hmap.get("Doj"));
		ep.setaddr((String)hmap.get("addr"));
		/*dp.setdept_id((String)hmap.get("dept_id"));
		pj.setproj_id((String)hmap.get("proj_id"));
		rl.setroles_id((String)hmap.get("roles_id"));*/
		
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}

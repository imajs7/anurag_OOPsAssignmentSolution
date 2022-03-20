package com.greatlearning.main;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greetings = "Welcome to ";
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println( greetings + admin.departmentName() );
		System.out.println( admin.getTodaysWork() );
		System.out.println( admin.getWorkDeadline() );
		System.out.println( admin.isTodayAHoliday() );
		
		System.out.println();
		
		System.out.println( greetings + hr.departmentName() );
		System.out.println( hr.doActivity() );
		System.out.println( hr.getTodaysWork() );
		System.out.println( hr.getWorkDeadline() );
		System.out.println( hr.isTodayAHoliday() );
		
		System.out.println();
		
		System.out.println( greetings + tech.departmentName() );
		System.out.println( tech.getTodaysWork() );
		System.out.println( tech.getWorkDeadline() );
		System.out.println( tech.getTechStackInformation() );
		System.out.println( tech.isTodayAHoliday() );
		

	}

}

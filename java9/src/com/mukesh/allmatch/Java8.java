package com.mukesh.allmatch;

import java.util.Arrays;
import java.util.List;

public class Java8{
	 public static void main(String[] args) {
	        List<Employee> list = Arrays.asList(
	                new Employee("Azam", "Male", 30),
	                new Employee("Payal", "Female", 33),
	                new Employee("Yana", "Female", 40),
	                new Employee("Reza", "Male", 31));
	        boolean allMatch = list.stream().allMatch(employee -> employee.getAge() >= 30);
	        System.out.println("all employees age is above 30: "+allMatch);
	        boolean anyMatch = list.stream().anyMatch(employee -> employee.getAge() >= 40);
	        System.out.println("Anyone employees age is above 40: "+anyMatch);
	        boolean nonMatch = list.stream().noneMatch(employee -> employee.getAge() < 30);
	        System.out.println("None of them age is below 30: "+nonMatch);
	    }
	}



	
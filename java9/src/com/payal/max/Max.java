package com.payal.max;

import java.util.Arrays;
import java.util.List;

public class Max {
	 public static void main(String[] args) {
		 List<Employee> list = Arrays.asList(
	                new Employee("Azam", "Male", 30),
	                new Employee("Payal", "Female", 33),
	                new Employee("Yana", "Female", 40),
	                new Employee("Reza", "Male", 31)
	        );

	        // Find the maximum age
	        int maxAge = Integer.MIN_VALUE;
	        for (Employee employee : list) {
	            if (employee.getAge() > maxAge) {
	                maxAge = employee.getAge();
	            }
	        }
	        System.out.println("Max age: " + maxAge);

	        // Find the minimum age
	        int minAge = Integer.MAX_VALUE;
	        for (Employee employee : list) {
	            if (employee.getAge() < minAge) {
	                minAge = employee.getAge();
	            }
	        }
	        System.out.println("Min age: " + minAge);
	    }
	}
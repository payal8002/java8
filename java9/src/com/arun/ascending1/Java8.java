package com.arun.ascending1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
	 public static void main(String[] args) {
	        //filter employees gender ways
	        List<Employee> list = Arrays.asList(
	                new Employee("Azam", "Male", 30),
	                new Employee("Payal", "Female", 33),
	                new Employee("Yana", "Female", 4),
	                new Employee("Reza", "Male", 31));
	        list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList())
	        .forEach(System.out::println);
	    }
	}



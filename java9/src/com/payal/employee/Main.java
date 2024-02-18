package com.payal.employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Mukesh", "IT"),
                new Employee("Payal", "Finance"),
                new Employee("Arun", "HR"),
                new Employee("Payal", "Finance"),
                new Employee("Mukesh", "IT"),
                new Employee("Jyoti", "Finance")
        );


        Map<String, Integer> departmentEmployeeCount = new HashMap<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
          
            if (!departmentEmployeeCount.containsKey(department)) {
                departmentEmployeeCount.put(department, 1);
            } else {
               
                departmentEmployeeCount.put(department, departmentEmployeeCount.get(department) + 1);
            }
        }

       
        for (Map.Entry<String, Integer> entry : departmentEmployeeCount.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Employee Count: " + entry.getValue());
        }
    }
}


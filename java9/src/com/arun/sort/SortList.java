package com.arun.sort;



public class SortList {

    public static void main(String[] args) {
       
            Employee[] employees = {
            		new Employee("Azam", "Male", 30),
                    new Employee("Payal", "Female", 33),
                    new Employee("Yana", "Female", 4),
                    new Employee("Reza", "Male", 31)
            };


            // Sort the array of Employee objects in ascending order based on age
            for (int i = 0; i < employees.length; i++) {
                for (int j = i + 1; j < employees.length; j++) {
                    if (employees[i].getAge() > employees[j].getAge()) {
                        Employee temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
            }

            // Displaying elements of array after sorting
            System.out.println("Elements of array sorted in ascending order: ");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }    
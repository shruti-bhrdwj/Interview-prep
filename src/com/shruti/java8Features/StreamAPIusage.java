package com.shruti.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIusage {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
               new Employee("Shruti",85000.0f,"IT & Software",26),
                new Employee("Nisha",75000.0f,"IT & Hardware",24),
                new Employee("Sapna",65000.0f,"HR & Admin",30),
                new Employee("Dipika",55000.0f,"Audit & Finance",20)
        );

        // map -  Transforming list, make another list type, Emp to double in this case
        // get emp bonus
        List<Double> empBonus =empList.stream().map(n -> n.getEmpSalary()*0.1).toList();
        System.out.println("Emp bonuses: " + empBonus);

        // filter - filtering list, return same List type as streamed collection to filter some data
        // get IT employee
        List<Employee> empItList = empList.stream().filter(e -> e.EmpDept.startsWith("IT")).toList();
        System.out.println("Emp of IT: " + empItList);

        //reduce - List to element type
        //total salary
        float totalSalary = empList.stream().map(Employee::getEmpSalary).reduce(0f,(a,b)-> a+b);
        System.out.println("Emp total Salary: " + totalSalary);

        //sort - sort  elements
        //desc of age
        List<Employee> ageSorted = empList.stream().sorted((a, b) -> b.getAge() - a.getAge()).toList();
        System.out.println("Emp age Sorted: " + ageSorted);


    }

    }



     class Employee{
         String EmpName;
         float EmpSalary;
         String EmpDept;
         int age;

        public Employee(String empName, float empSalary, String empDept, int age) {
            this.EmpName = empName;
            this.EmpSalary = empSalary;
            this.EmpDept = empDept;
            this.age = age;
        }

        public float getEmpSalary() {
            return EmpSalary;
        }

        public void setEmpSalary(float empSalary) {
            EmpSalary = empSalary;
        }

        public String getEmpDept() {
            return EmpDept;
        }

        public void setEmpDept(String empDept) {
            EmpDept = empDept;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmpName() {
            return EmpName;
        }

        public void setEmpName(String empName) {
            EmpName = empName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "EmpName='" + EmpName + '\'' +
                    ", EmpSalary=" + EmpSalary +
                    ", EmpDept='" + EmpDept + '\'' +
                    ", age=" + age +
                    '}';
        }

}

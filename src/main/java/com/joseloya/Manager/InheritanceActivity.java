package com.joseloya.Manager;

public class InheritanceActivity {
    public static void main(String[] args) {
       Employee employee = new Manager(126534, "John",
               "Channai", 00000000L,
               85000);
       double salary = employee.calculateSalary();
       System.out.println("Manager salary is " + employee.calculateSalary());

       Employee employee2 = new Trainee(112233, "Mary",
               "Mumbai", 01234567L,
               95000);
       //double salary = employee.calculateSalary();
    }
}

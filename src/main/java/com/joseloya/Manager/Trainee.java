package com.joseloya.Manager;

public class Trainee extends Employee {
    private double basicSalary;

    public Trainee(long employeeId, String employeeName,
                   String employeeAddress, long employeePhone,
                   double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        setBasicSalary(basicSalary);
    }

    private void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}

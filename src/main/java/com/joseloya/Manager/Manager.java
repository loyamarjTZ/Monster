package com.joseloya.Manager;

public class Manager extends Employee {

    private double basicSalary;

    public Manager(long employeeId, String employeeName,
                   String employeeAddress, long employeePhone,
                   double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        setBasicSalary(basicSalary);
    }

    private void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateTransportAllowance(){
        return 15 * getBasicSalary() / 100;
    }


}

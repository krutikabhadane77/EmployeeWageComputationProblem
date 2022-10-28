//UC1 Check employee is present or absent
//UC2 Calculate daily employee wage
package com.employeewagecomputationproblem;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
        final int FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int workingHours = 0;
        double empType = Math.floor(Math.random() * 10) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }

}

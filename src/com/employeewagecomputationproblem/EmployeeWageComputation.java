//UC1 Check employee is present or absent
package com.employeewagecomputationproblem;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
        final int FULL_TIME = 1;
        double empType = Math.floor(Math.random() * 10) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
    }
}

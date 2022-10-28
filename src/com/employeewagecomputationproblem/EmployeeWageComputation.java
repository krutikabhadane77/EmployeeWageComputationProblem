//UC1 Check employee is present or absent
//UC2 Calculate daily employee wage
//UC3 Add part time employee & wage
//UC4 Using switch case statement
//UC5 Calculating wages for a month
//UC6 Calculate wages till condition of total working hours or days is reached for a month
//UC7 Refactor the code write a class method to compute employee wage
//UC8 Compute employee wage for multiple companies
package com.employeewagecomputationproblem;

public class EmployeeWageComputation {
    public static void calculateTotalWage(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS)
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        int totalWage = 0;
        int workingHrs = 0;
        System.out.println("Details of "+company+ "employee");
        System.out.println("Wage per hour "+WAGE_PER_HR);
        System.out.println("Maximum working hours "+MAX_WORKING_HRS);
        System.out.println("Maximum working days "+MAX_WORKING_DAYS);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType)
            {
                case FULL_TIME:
                    workingHrs = 8;
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        System.out.println("Total wage for a month of " + company+ " employee is " +totalWage);
    }
    public static void main(String[] args)
    {
        calculateTotalWage("Amazon", 20,16, 150);
        calculateTotalWage("Flipkart",40,20,100);
        calculateTotalWage("Nykaa",30,15,100);
        calculateTotalWage("Big Bazaar",20,20,200);
        calculateTotalWage("Dmart", 25,25, 150);
    }
}
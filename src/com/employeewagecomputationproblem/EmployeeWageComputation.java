//UC1 Check employee is present or absent
//UC2 Calculate daily employee wage
//UC3 Add part time employee & wage
//UC4 Using switch case statement
//UC5 Calculating wages for a month
//UC6 Calculate wages till condition of total working hours or days is reached for a month
package com.employeewagecomputationproblem;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;
        int totalWage = 0;
        int workingHrs = 0;
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
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
        System.out.println("Total wage for a month is " + totalWage);
    }

}
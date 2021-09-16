package com.BridgeLabz;

import java.util.Random;

public class EmpWageBuilder {
    public static final int Emp_RatePerHrs = 20;
    public static final int workingDays = 20;

    public static void main(String[] args) {

        int emphrs = 0;
        int empwage = 0;
        int totalempwage = 0;
        int day = 0;

        for (int i = 0; i < 20; i++) {
            day++;
            int CheckEmp = (int) Math.floor(Math.random() * 10 % 3);

            switch (CheckEmp) {
                case 1:
                    System.out.println("The Day Employee Is Present Full-Time is : " + day);
                    emphrs = 8;
                    break;
                case 2:
                    System.out.println("The Day Employee Is Present Part-time is : " + day);
                    emphrs = 4;
                    break;
                default:
                    System.out.println("The Day Employee Is Absent is : " + day);
                    emphrs = 0;
                    break;
            }
            empwage = emphrs * Emp_RatePerHrs;
            totalempwage += empwage;
            System.out.println("Employee Wage is : " + empwage);
        }
        System.out.println("Total Employee Wage is : " + totalempwage);
    }
}




package com.BridgeLabz;

import java.util.Random;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int IS_FULL_TIME1 = 1;
        int IS_FULL_TIME2 = 2;
        int IS_PART_TIME1 = 1;
        int IS_PART_TIME2 = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        // Taking Random values 0 or 1. 0==Absent And 1==Present
        Random random = new Random();
        int empCheck = random.nextInt(2);
        int empCheck1 = random.nextInt(3);
        int empCheck2 = random.nextInt(3);
        // Checking the condition Using Switch Case
        switch (empCheck) {
            case IS_FULL_TIME2:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wages of an employee is : " + empWage);
    }

        }


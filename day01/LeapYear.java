package src.day01;

import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a year : ");
        int year = sc.nextInt();

        boolean result = isLeapYear(year);

        if(!result){
            System.out.println("not a leap year");
        }else{
            System.out.println("leap year");
        }

    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
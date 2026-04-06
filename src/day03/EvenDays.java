package src.day03;

import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO.OF DAYS IN A MONTH - ");
        int num=sc.nextInt();
        if (num < 28 || num > 31) {
            System.out.println("Invalid number of days for a month");
            return;
        }
        int count=num/2;
        System.out.println(count);
    }
}

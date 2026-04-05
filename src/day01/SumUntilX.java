package src.day01;

import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int x = sc.nextInt();
        System.out.print("ENTER A VALUE TO STOP THE PROGRAM AND RETURN SUM = ");
        int stopValue = sc.nextInt();
        int sum =0;
        while(x!=stopValue){
            sum += x;
            System.out.print("Enter a value : ");
            x = sc.nextInt();
        }
        System.out.print("TOTAL SUM UNTIL X: " + sum);
    }
}

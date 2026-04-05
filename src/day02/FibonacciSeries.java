package src.day02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number = ");
        int num = input.nextInt();
        int ist =0,sec=1;
        int count=2;
        if(num==1){
            System.out.print("the fibonnaci series =" + ist);
        }else{
            System.out.print(" the fibonnaci series = " + ist + " "+ sec);
            while(count<num){
                int third = ist + sec;
                System.out.print(" " + third);
                ist= sec;
                sec= third;

                count++;
            }
        }
    }
}

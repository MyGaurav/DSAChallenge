package src.day03;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO CHECK IF ITS A PERFECT NUMBER - ");
        int num=sc.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        boolean result = checkPerfectNumber(num);
        if(result){
            System.out.println("A PERFECT NUMBER ");
        }else{
            System.out.println("NOT A PERFECT NUMBER ");
        }

    }

    private static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum+=i;
            }
        }
        return num==sum;
    }
}

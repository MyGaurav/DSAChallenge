package src.day03;

import java.util.Scanner;
gi
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER TO CHECK IF ITS A PRIME NUMBER - ");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println("enter a natural number");
            return;
        }

        boolean result=checkPrime(num);
        if(result){
            System.out.println("prime number");
        }else{
            System.out.println("not a prime number");
        }

    }

    private static boolean checkPrime(int num) {
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for(int i=3;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

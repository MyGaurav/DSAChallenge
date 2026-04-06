package src.day03;

import java.util.Scanner;

public class SubProdFromSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number =");
        int num = in.nextInt();
        if(num <=0){
            System.out.println("ENTER A Positive Num ");
            return;
        }
        int prodOfDigits =prodOfDigit(num);
        System.out.println("Product of digits = " + prodOfDigits);

        int sumOfDigits =sumOfDigit(num);
        System.out.println("Sum of digits = " + sumOfDigits);

        System.out.print("subtract product from sum = " + (prodOfDigits - sumOfDigits));

    }
    private static int sumOfDigit(int num) {
        int sum =0;

        while(num>0){
            int rem = num%10;
            sum += rem;
            num /=10;
        }
        return sum;
    }
    private static int prodOfDigit(int num) {
        int prod =1;

        while(num>0){
            int rem = num%10;
            prod *= rem;
            num /=10;
        }
        return prod;
    }

}
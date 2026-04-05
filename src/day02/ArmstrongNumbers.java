package src.day02;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int temp = sc.nextInt();
        System.out.print("enter a number = ");
        int num = sc.nextInt();

        if(temp<0 || num<0){
            System.out.println("enter a positive no.");
            return;
        }

        System.out.print("the armstrong no. are = ");


        for (int i = temp; i <= num; i++) {

            int tempCopy = i;
            int count = 0;

            int forCount = tempCopy;
            if(forCount>0){
                while (forCount > 0) {
                    forCount /= 10;
                    count++;
                }
            }

            double sum = 0;

            if(i==0){
                sum =0;
            }else{
                int forSum = tempCopy;
                while (forSum > 0) {
                    int rem = forSum % 10;
                    sum += Math.pow(rem, count);
                    forSum /= 10;
                }
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

    }
}

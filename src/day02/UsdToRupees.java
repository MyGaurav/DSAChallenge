package src.day02;

import java.util.Scanner;

public class UsdToRupees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER USD TO CONNVERT INTO RUPEES : ");

        // current 1 usd = 92.74
        double usd = input.nextDouble();
        double rupees = convertUsdToRupees(usd);
        System.out.println("RUPEES : " + rupees);

    }

    private static double convertUsdToRupees(double usd) {
        return usd*92.74;
    }
}

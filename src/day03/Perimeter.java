package src.day03;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner in = new Scanner(System.in);

        while (exit) {
            System.out.println("\nTYPE 1 FOR PERIMETER");
            System.out.println("TYPE 2 FOR AREA");
            System.out.println("TYPE 3 TO EXIT");

            int start = in.nextInt();

            switch (start) {
                case 1:
                    perimeter(in);
                    break;
                case 2:
                    area(in);
                    break;
                case 3:
                    exit = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void area(Scanner in) {
        System.out.println("\n1. Area of Square");
        System.out.println("2. Area of Rectangle");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                areaOfSquare(in);
                break;
            case 2:
                areaOfRectangle(in);
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private static void areaOfSquare(Scanner in) {
        System.out.print("Enter side: ");
        int side = in.nextInt();
        System.out.println("Area of Square = " + (side * side));
    }

    private static void areaOfRectangle(Scanner in) {
        System.out.print("Enter length: ");
        int l = in.nextInt();
        System.out.print("Enter width: ");
        int w = in.nextInt();
        System.out.println("Area of Rectangle = " + (l * w));
    }

    private static void perimeter(Scanner in) {
        System.out.println("\n1. Perimeter of Square");
        System.out.println("2. Perimeter of Rectangle");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                int s = in.nextInt();
                System.out.println("Perimeter of Square = " + (4 * s));
                break;

            case 2:
                System.out.print("Enter length: ");
                int l = in.nextInt();
                System.out.print("Enter width: ");
                int w = in.nextInt();
                System.out.println("Perimeter of Rectangle = " + (2 * (l + w)));
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
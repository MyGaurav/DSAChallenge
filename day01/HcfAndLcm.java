    package src.day01;

    import java.util.Scanner;

    public class HcfAndLcm {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int firstDigit = sc.nextInt();
            int secondDigit = sc.nextInt();
            int hcf = findHcf(firstDigit, secondDigit);
            System.out.println("the hcf = " +hcf);
            int lcm = findLcm(firstDigit, secondDigit);
            System.out.println("the lcm = " +lcm);
        }
        public static int findHcf(int a,int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static int findLcm(int a,int b){
            int temp = (a*b)/findHcf(a,b);
            return temp;
        }
    }



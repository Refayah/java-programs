import java.util.Scanner;

public class Lcmgcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD = "+ gcd);
        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}
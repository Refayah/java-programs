import java.util.Scanner;

public class Insertingstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        System.out.println("enter the string to be inserted");
        String n=sc.nextLine();
        System.out.println("enter the index");
        int ind=sc.nextInt();
        System.out.println(str.substring(0,ind)+n+str.substring(ind));
    }
}

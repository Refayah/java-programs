import java.util.Scanner;

public class Automorphicno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq=num*num;
        int digit=String.valueOf(num).length();
        int rem=sq%(int)Math.pow(10, digit);
        if(rem==num)
        {
            System.out.println("automorphic no");
        }
        else{
            System.out.println("not an automorphic no");
        }
        sc.close();
    }
}

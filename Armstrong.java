import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int rem=0;int sum=0;int no=num;
        int digits=String.valueOf(num).length();
        while(no>0)
        {
            rem=no%10;
            sum+=Math.pow(rem, digits);
            no=no/10;
        }
        if(sum==num)
        {
            System.out.println("Arnstrong no");
        }
        else{
            System.out.println("not an Armstrong no");
        }
        sc.close();
    }
}

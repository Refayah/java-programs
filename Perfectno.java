import java.util.Scanner;

public class Perfectno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("perfect no");
        }
        else{
            System.out.println("not a perfect no");
        }
        sc.close();
    }
}

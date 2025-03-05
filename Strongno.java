import java.util.Scanner;

public class Strongno {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();int n=num;int rem=0;int sum=0;
        while(n>0)
        {
              rem=n%10;
              sum+=fact(rem);
              n=n/10;
        }
        if(sum==num)
        {
            System.out.println("Strong no");
        }
        else{
            System.out.println("not a strong no");
        }
        sc.close();
    }
    public static int fact(int num)
    {   int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
}

import java.util.Scanner;

public class Addfractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numerators and denominator of first no and second no");
        int a=sc.nextInt();
        System.out.println("--");
        int b=sc.nextInt();
        System.out.println();
        int c=sc.nextInt();
        System.out.println("--");
        int d=sc.nextInt();
        int num = (a*d)+(b*c);
        int den=b*d;
        int gcd=0;
        for(int i=1;i<=num&&i<=den;i++)
        {
            if(num%i==0&&den%i==0)
            {
                gcd=i;
            }
        }
        int n=num/gcd;
        int de=den/gcd;
        System.out.println("the answer is "+n+"/"+de);
        sc.close();;
    }
}

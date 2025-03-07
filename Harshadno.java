import java.util.Scanner;

public class Harshadno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int sum=0;
        for(int i=n;i>0;i/=10)
        {
            sum+=i%10;
        }
        if (n%sum==0) {
            System.out.println("harshad number");
        }
        else{
            System.out.println("not a harshad number");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Numberrepeats {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n=sc.nextInt();
        int count =0;
        while(number>0)
        {
            int a=number%10;
            if(a==n)
            {
                count++;
            }
            number=number/10;
        }
        System.out.println();
        System.out.println(count);
        sc.close();
    }
}

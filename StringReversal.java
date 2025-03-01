import java.util.Scanner;

public class StringReversal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String r=" ";char ch;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
              ch=str.charAt(i);
              r=ch+r;
        }
        System.out.println("the reversed string is :"+r);
        sc.close();
    }
}

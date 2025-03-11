import java.util.Scanner;

public class Stringoccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int[] freq=new int[256];
        char ch=str.charAt(0 );
        for(char c:str.toCharArray())
        {
            freq[c]++;
            if (freq[c]>count) {
                count=freq[c];
                ch=c;
            }
        }
        System.out.println("maximum occurrence is string is: "+ch);
        sc.close();
   }
}

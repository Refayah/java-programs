import java.util.Scanner;

public class Stringanagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String s1=sorting(str1);
        String s2=sorting(str2);
        sc.close();
        if (s1.equals(s2)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("not an anagram");
        }
    }
    public static String sorting(String str)
    {
        str=str.toLowerCase();
        char[] arr=str.toCharArray();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (arr[i]>arr[j]) {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String str1=new String(arr);
        return str1;
    }
}

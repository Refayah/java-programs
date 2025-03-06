import java.util.Scanner;

public class Countinstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowel=0;
        int consonant=0;
        int specialchar=0;
        int digit=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            {
                 ch=Character.toLowerCase(ch);
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 {
                    vowel++;
                 }
                 else{
                    consonant++;
                 }
            }
            else if(ch>='0' && ch<='9')
            {
                 digit++;
            }
            else{
                specialchar++;
            }
        }
        System.out.println("vowels :"+ vowel);
        System.out.println("consonant :"+ consonant);
        System.out.println("special characters :"+ specialchar);
        System.out.println("digits :"+ digit);
        sc.close();
    }
}

import java.util.Scanner;

public class Lexicstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if (str.equals("")) {
            System.out.println("a");
        }
        int i=str.length()-1;
        while (i>=0&&str.charAt(i)=='z') {
            i--;
        }
        if (i==-1)
        {
            System.out.println(str+'a');
        }
        else{
            System.out.println(str.substring(0, i)+(char)(str.charAt(i)+1)+str.substring(i+1));
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String[] words=str.split("\\s+");
        String min=words[0];
        String max=words[0];
        for (String word : words)
        {
            if (word.length()<min.length()) {
                min=word;
            }
            if (word.length()>max.length()) {
                max=word;
            }
        }
        System.out.println(min);
        System.out.println(max);
        sc.close();
    }
}

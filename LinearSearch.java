import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];int  pos=0;
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the search element");
        int search=sc.nextInt();
        boolean bool=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                bool=true;
                pos=i+1;
            }
        }
        if(bool)
        {
             System.out.println("element found at positon "+pos);
        }
        else{
            System.out.println("element not found");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of array elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the search element");
        int search=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int left=0;int right=n-1;
        boolean found=false; int pos=0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==search)
            {
                pos=mid+1;
                found=true;
                break;
            }
            if(arr[mid]>search)
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(found)
        {
            System.out.println("element found at position "+pos);
        }
        else{
            System.out.println("element not found");
        }
        sc.close();    
    }
}

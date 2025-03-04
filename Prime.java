import java.util.Scanner;

public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int prime=0;
        sc.close();
        for(int i=0;i<n;i++)
        {
            if(primeno(arr[i])){
                prime=arr[i];
                System.out.println(prime);
            }
        }
    }
        public static boolean primeno(int num)
        {   if(num==2)
            {
                return false;
            }
            for(int i=2;i*i<=num;i++)
            {
                  if(num%i==0)
                  {
                    return false;
                  }
            
            }
            return true;
        }
    
}

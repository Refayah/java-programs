public class Symmetricpairs {
    public static void main(String args[])
    {   
        int[][] arr={
            {10,12},
            {12,10},
            {40,50},
            {50,60},
            {60,50}
        };
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int a=arr[i][0];
            int b=arr[i][1];
            for(int j=i+1;j<n;j++)
            {
                int c=arr[j][0];
                int d=arr[j][1];
                if(a==d && b==c)
                {
                    System.out.println("("+a+","+b+")");
                }
            }
        }
    }
}

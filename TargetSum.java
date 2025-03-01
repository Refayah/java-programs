public class TargetSum {
    public static void main(String args[])
    {
        int[] arr={-1,0,1,2,3,4,5,6,7,8};
        int n=arr.length;
        int target=7;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
            System.out.println();
        }
    }
}

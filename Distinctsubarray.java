public class Distinctsubarray {
    public static void main(String args[])
    {
        int[] arr={1,1,1,2,3,3,4,5,6,7,8,8,9,10,10};
        int n=arr.length;
        int j=1;
        System.out.println(arr[0]);
        for (int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j]=arr[i];
                System.out.println(arr[j]);
                j++;
            }
        }
        System.out.println();
        System.out.println(j);
    }
}

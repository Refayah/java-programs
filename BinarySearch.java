

public class BinarySearch {
    public static void main(String args[])
    {
        int arr[]={29,34,45,56,79,84};
        int search= 84;
        int l=0;int r=arr.length-1;
        boolean found=false;
        
        while(l<=r)
        {   int mid=(l+r)/2;
            if(arr[mid]==search)
            {
                System.out.println("target found at "+(mid+1)+ " position");
                found=true;
                break;
            }
            else if(search<arr[mid])
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if (!found)
            {
                System.out.println("element not found");
            }
    }
}

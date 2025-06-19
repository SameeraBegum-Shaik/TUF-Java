public class SSmallSLarge3 {
    public static int SecondSmallest(int[] a,int n)
    {
        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<small)
            {
                ssmall=small;
                small=a[i];
            }
            else if(a[i] < ssmall && a[i]!=small)
            {
                ssmall=a[i];
            }
        }
        return ssmall;
    }
    public static int SecondLargest(int[] a,int n)
    {
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>large)
            {
                slarge=large;
                large=a[i];
            }
            else if(a[i] > slarge && a[i]!=large)
            {
                slarge=a[i];
            }
        }
        return slarge;
    }

    public static void main(String[] args) {
        int[] arr = {34,890,23,12};
        int n= arr.length;
        System.out.println("The second smallest is : "+SecondSmallest(arr,n));
        System.out.println("The second largest  is : "+SecondLargest(arr,n));
    }
}

import java.util.Arrays;
class SSmallSLarge {
    public static int secondSmall(int a[] , int n)
    {
        Arrays.sort(a);
        return a[1];
    }
    public static int secondLarge(int a[] , int n)
    {
        Arrays.sort(a);
        return a[n-2];
    }
    public static void main(String[] args)
    {
        int[] arr={12,7,4,5,90};
        int n=arr.length;
        System.out.println("The second smallest is :  "+secondSmall(arr,n));
        System.out.println("The second largest is :  "+secondLarge(arr,n));
    }
}

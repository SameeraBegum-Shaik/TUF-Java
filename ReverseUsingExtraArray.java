public class ReverseUsingExtraArray {
    static void reverseArray(int[] arr,int n)
    {
        int[] res=new int[arr.length];
        for(int i=n-1;i>=0;i--)
        {
            res[n-i-1]=arr[i];
        }
        Utility.PrintArray(res);
    }

    public static void main(String... args) {
       int[] arr={1,2,3,4};
       reverseArray(arr,arr.length);
    }
}

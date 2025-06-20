class ReverseArraybySwap {
    static void reverseArray(int[] arr,int n)
    {
        int p1=0,p2=n-1;
        while(p1<p2)
        {
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        Utility.PrintArray(arr);
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        reverseArray(arr,arr.length);
    }
}

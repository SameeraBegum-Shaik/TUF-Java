import java.util.Arrays;
public class ReArrangeArrayIncreasing_DecreasingOrder {
    public static void main(String... args) {
        int[] arr={23,16,19,24,67,90};
        int n=arr.length;
        reArrange(arr,n);
    }
    static void reArrange(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }

    }
}

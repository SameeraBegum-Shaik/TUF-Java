import java.util.*;
public class MaxProductSubarrayBetterApproach {
    static int maxProduct(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int prod = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                result=Math.max(result,prod);
                prod*=arr[j];
                }
            result=Math.max(result,prod);
            }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,-1};
        int ans=maxProduct(arr);
        System.out.println("Max product is "+ans);
    }
}


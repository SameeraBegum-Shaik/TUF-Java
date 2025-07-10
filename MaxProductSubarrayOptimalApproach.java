import java.util.*;
public class MaxProductSubarrayOptimalApproach {
    static int maxProduct(int[] arr){
        int n=arr.length;
        int pre=1,suff=1;
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=arr[i];
            suff*=arr[n-i-1];
            result=Math.max(result,Math.max(pre,suff));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,-1};
        int ans=maxProduct(arr);
        System.out.println("Max product is "+ans);
    }
}

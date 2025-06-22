public class SumOfArrayElements {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of elements in the array is "+sum);
    }
}

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,3,4,5};
        int avg;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println("The average of array elements is: "+avg);
    }
}

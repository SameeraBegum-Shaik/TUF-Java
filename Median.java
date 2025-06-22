public class Median {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,2,3,4,5,6};
        int median;
        if(n % 2==0){
            int i=((n/2)+(n+1)/2)/2;
            median=arr[i];
        }
        else{
            median=arr[n/2];
        }
        System.out.println("The median is "+median);
    }
}

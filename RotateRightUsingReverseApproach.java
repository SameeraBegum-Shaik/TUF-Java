public class RotateRightUsingReverseApproach {
    public static void reverse(int[] arr, int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr,int n,int k) {
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5,6};
            System.out.println("Array before rotation: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
            rotateArray(arr,arr.length,2);
            System.out.println("Array after rotation: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
    }

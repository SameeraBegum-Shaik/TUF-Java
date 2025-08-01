public class RotateRight {
    public static void rotateArray(int[] arr,int n,int k){
        int[] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args){
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

public class AddingElementsAtBegin {
    static void insertBegin(int[] arr,int value,int n){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=value;
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr={11,12,13,14,15,0};
        insertBegin(arr,16,5);
        System.out.println("Inserting element at beginning: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class AddingElementAtPos {
    static void addAtPos(int[] arr, int n, int value, int pos) {
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = value;
    }

    public static void main(String[] args){
    int n = 5;
    int[] arr = {11, 12, 13, 14, 15, 0};
    addAtPos(arr, n,16,2);
        System.out.println("Inserting element at a specific position: ");
     for(int i=0;i<=n;i++)
    {
        System.out.print(arr[i] + " ");
    }

}
}





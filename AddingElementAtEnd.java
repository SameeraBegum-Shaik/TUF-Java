public class AddingElementAtEnd {
    static void addAtEnd(int[] arr, int n, int value) {
        arr[n] = value;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {11, 12, 13, 14, 15, 0};
        addAtEnd(arr,n,16);
        System.out.println("Inserting element at ending: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

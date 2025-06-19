import java.util.Scanner;
class ArrayElements {
    public static int[] inputArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Element at index "+i+" ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}

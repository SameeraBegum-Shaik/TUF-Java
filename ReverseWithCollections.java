import java.util.*;
public class ReverseWithCollections {
    static void reverseArray(Integer[] arr)
    {
       Collections.reverse(Arrays.asList(arr));
        PrintArray(arr);
    }
   static void PrintArray(Integer[] arr)
    {
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr={1,2,3,4};
        reverseArray(arr);

    }
}

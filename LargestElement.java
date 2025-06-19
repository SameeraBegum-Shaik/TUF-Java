import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr1=ArrayElements.inputArray();
        System.out.println("Largest element is : "+sort(arr1));
    }
    public static int sort(int[] arr1){
        Arrays.sort(arr1);
        return arr1[arr1.length - 1];
    }
}

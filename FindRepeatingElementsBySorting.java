import java.util.Arrays;
public class FindRepeatingElementsBySorting {
    static void findRepeatingElements(int[] arr){
        System.out.println("The repeating elements are: ");
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+"  ");
                while(i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,1,4,3,2,3};
        findRepeatingElements(arr);
    }
}

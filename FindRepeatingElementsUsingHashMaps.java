import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
public class FindRepeatingElementsUsingHashMaps {
    static void findRepeatedElements(int[] arr){
        HashMap <Integer,Integer> elementCount=new HashMap<>();
        for(int i:arr){
            if(elementCount.get(i)==null){
                elementCount.put(i,1);
            }
            else{
                elementCount.put(i,elementCount.get(i)+1);
            }
        }
        System.out.println("The repeating elements are: ");
        for(Entry<Integer,Integer> entry : elementCount.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,1,3,2,4,6,3,2};
        findRepeatedElements(arr);
    }
}

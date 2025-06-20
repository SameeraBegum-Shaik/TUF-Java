import java.util.HashMap;
import java.util.Map;

public class CountFrequencyUsingHashMap {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,3,2};
        int n=arr.length;
        countFrequency(arr,n);
    }
    static void countFrequency(int[] arr,int n)
    {
        //key-->element
        //value-->frequency
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" occurred "+entry.getValue()+" times.");
        }
    }
}

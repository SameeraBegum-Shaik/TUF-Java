import java.util.*;

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    Pair(){

    }
}
public class OptimalSortingByFrequency {

    //sorting elements
    public static void sortElements(int[] arr,int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //Creating a pair of list to store elements and frequency
        ArrayList<Pair> vec = new ArrayList<>();
        for (int x : map.keySet()) {
            vec.add(new Pair(x, map.get(x)));
        }

        //sorting the elements by its frequency using Collections
        Collections.sort(vec, (a, b) -> {
            if (a.second == b.second) return a.first - b.first;
            else return b.second - a.second;
        });

        //printing the elements after sorting
        for (int i = 0; i < vec.size(); i++) {
            while (vec.get(i).second > 0) {
                System.out.print(vec.get(i).first + " ");
                vec.get(i).second--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,3,4,1,5,8,8,2,2,1};
        int n=arr.length;
        sortElements(arr,n);
    }
}

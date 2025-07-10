import java.util.HashMap;
public class SymmetricPairsUsingHashMaps {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {2, 1}, {4, 5}};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            if (mp.get(second) != null && mp.get(second) == first) {
                System.out.println("(" + second + "," + first + ")");
            } else {
                mp.put(first, second);
            }


        }
    }
}

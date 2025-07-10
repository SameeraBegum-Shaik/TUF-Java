public class SymmetricPairsBruteForceApproach {
    public static void main(String[] args) {
        int n=5;
        int[][] arr={{1,2},{3,4},{2,1},{4,5}};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i][0]==arr[j][1]&& arr[j][0]==arr[i][1]){
                    System.out.println("("+arr[i][1]+","+arr[i][0]+")");
                    break;
                }
            }
        }
    }
}

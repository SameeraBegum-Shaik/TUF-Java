public class CountFrequencyUsingLoops {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,3,2};
        int n=arr.length;
        countFrequency(arr,n);
    }
    static void countFrequency(int[] arr,int n)
    {
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true)  continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occurred "+count+" times.");
        }
    }
}

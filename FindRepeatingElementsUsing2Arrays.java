public class FindRepeatingElementsUsing2Arrays {
    static void findRepeatingElement(int[] arr){
        int count=0;
        int[] dup=new int[arr.length];
        System.out.println("The repeating elements are: ");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup[count++]=arr[i];
                }
            }
        }
        for(int i=0;i<count-1;i++){
            if(dup[i]!=dup[i+1]){
                System.out.print(dup[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,4,3,2};
        findRepeatingElement(arr);
    }
}

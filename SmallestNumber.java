public class SmallestNumber {
    public static void main(String[] args) {
    int[] num=ArrayElements.inputArray();
    int min=num[0];
    for(int i=0;i<num.length;i++){
        if(num[i]<min){
            min=num[i];
        }
    }
        System.out.println("Minimum element is "+min);
    }
}

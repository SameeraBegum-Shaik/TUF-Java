public class SSmallSLarge2 {
    public static void SecondSmall_SecondLarge(int[] a,int n)
    {
     int small=Integer.MAX_VALUE;
     int ssmall=Integer.MAX_VALUE;
     int large=Integer.MIN_VALUE;
     int slarge=Integer.MIN_VALUE;
     for(int i=0;i<n;i++)
     {
         small=Math.min(small,a[i]);
         large=Math.max(large,a[i]);
     }
     for(int i=0;i<n;i++)
     {
         if(a[i]<ssmall && a[i]!=small) ssmall=a[i];
         if(a[i]>slarge && a[i]!=large) slarge=a[i];
     }
        System.out.println("Second smallest is : "+ssmall);
        System.out.println("Second largest  is : "+slarge);
    }

    public static void main(String[] args) {
        int[] a={22,234,11,5};
        int n=a.length;
        SecondSmall_SecondLarge(a,n);
    }
}

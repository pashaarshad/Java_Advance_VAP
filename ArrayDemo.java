import java.util.*;

public class ArrayDemo {

    public static void main(StringCode[] args) {
        System.out.println("Hello hi");
        int[] arr = {5,7,3,8,7,4,3};
        int val=0;
        int i;
        // for(i=0;i<10;i++)
        // {
        //     System.out.println(i);
        // }

        // for(i=0;i<arr.length;i++)
        // {
        //     val = arr[i] + val;
        //     System.out.println(val);
        // }
        // int avg =val/arr.length;
        // System.out.println("The Avereage is " + avg);

          int max_val = arr[0];
         for(i=0;i<arr.length;i++)
        {
           if(arr[i] > max_val)
           {
            max_val = arr[i];
           }
        }
        System.out.println(max_val);

    }
}

public class SenHigith {
    public static void main(String[] args){
        int[] arr = {5,7,8,34,5,3,7};

        int max1=0;
        int max2=0;

        if (arr[0]>arr[1]) {

            max1 = arr[0];
            max2 = arr[1];            
        }
        else{
            max1 =arr[1];
            max2 = arr[0];
        }

        for (int i=2;i<arr.length;i++)
        {
            if (max1<arr[i]) {
                max2 = max1;
                max1 = arr[i];                
            }
            else  if{}
        }
        }
}

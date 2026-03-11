import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int n = arr.length;
        Arrays.sort(arr);
        // 2 5 6 8 11

        // 2 pointer

        int left = 0;
        int right = arr.length-1;

        boolean found = false;

       while(left<right){

           int sum = arr[left]+arr[right];

           if(sum==target){

               System.out.println("yes");
               found = true;
               break;
           } else if (sum<target) {

               left++;

           }
           else {
               right--;
           }
       }

       if(found==false){

           System.out.println("no");
       }


    }
}
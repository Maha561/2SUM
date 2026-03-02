import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 18, 11};
        int target = 14;
        int n = arr.length;
        HashMap<Integer,Integer>  map = new HashMap<>();

        boolean found = false;

        for(int i =0;i<n;i++){

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Yes");
                found = true;
                break;
            }
            else{
                map.put(arr[i], i);
            }



        }

        if(found==false){

            System.out.println("no");


        }

    }
}
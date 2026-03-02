public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int n = arr.length;

        boolean found = false;

        for(int i =0;i<n;i++){

            for(int j =i+1;j<n;j++){

                if(arr[i]+arr[j]==target){

                    System.out.println("yes");
                    found=true;
                    break;
                }
            }


        }
        if(found==true){


        }
        else{

            System.out.println("no");
        }
    }
}
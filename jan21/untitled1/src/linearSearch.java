public class linearSearch {
    public static void main(String[] args) {

         int[] arr={2,5,4,45,454,22,126551,4154,5215,3,5,8,4,0};
        System.out.println(LinearSearch(arr,22));
    }

    public static int LinearSearch(int[] arr,int key){

        // implement here
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){


             return i;
         }
     }

        return -1;
    }
}
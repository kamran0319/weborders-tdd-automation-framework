public class binarySearchTest {
    public static void main(String[] args) {

         int[] arr={2,5,4,45,454,22,126551,4154,5215,3,5,8,4,0};
        System.out.println(binarySearch(arr,22));
    }

    public static int binarySearch(int[] arr,int key){

        // implement here
     int begin = 0;
     int end = arr.length-1;
     while (end >= begin){
         int mid =(begin + end)/2;
         if(arr[mid] < key){
             begin=mid+1;
         }else if(arr[mid]>key){
             end=mid-1;
         }else {
             return mid;
         }
     }

        return -1;
    }
}
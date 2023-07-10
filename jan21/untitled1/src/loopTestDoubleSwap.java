import java.util.Arrays;

public class loopTestDoubleSwap {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(doubleEach(new int[]{11, -4, 0, 777}))); //-> {11, 11, -4, -4, 0, 0, 777, 777}
//        System.out.println(Arrays.toString(doubleEach(new int[]{1, 2, 3, 4, 5})));// -> {1,1,2,2,3,3,4,4,5,5}
//        System.out.println(Arrays.toString(doubleEach(new int[]{100, 2, 9, -1})));// -> {100,100,2,2,9,9,-1,-1}
//        System.out.println(Arrays.toString(doubleEach(new int[]{5})));// -> {5,5}

    }


    public static int[] doubleEach(int[] arr){
        //method implementation here
        int[] copy=new int[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            copy[i]= arr[i];

        }
        return copy;
    }
}
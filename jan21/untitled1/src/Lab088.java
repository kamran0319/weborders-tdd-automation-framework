import java.util.Arrays;

public class Lab088 {
    public static void main(String[] args) {
        //TESTS
        //TESTS
        System.out.println(Arrays.toString(doubleEach(new int[] {11, -4, 0, 777}))); //-> {11, 11, -4, -4, 0, 0, 777, 777}
        System.out.println(Arrays.toString(doubleEach(new int[] {1,2,3,4,5})));// -> {1,1,2,2,3,3,4,4,5,5}
        System.out.println(Arrays.toString(doubleEach(new int[] {100,2,9,-1})));// -> {100,100,2,2,9,9,-1,-1}
        System.out.println(Arrays.toString(doubleEach(new int[] {5})));// -> {5,5}

    }


    public static int[] doubleEach(int[] arr){
        //method implementation here
        int[] ints= Arrays.copyOf(arr,arr.length);
        int[] result = new int[arr.length+ints.length];


        int i =0;
        for (int element: arr) {
            result[i] = element;
            i++;
        }for (int element: ints) {
            result[i] = element;
            i++;
        }
//        Arrays.sort(result);



        return result;



    }




}

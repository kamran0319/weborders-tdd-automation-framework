import java.util.Arrays;

public class Assingment19_1 {
    public static void main(String[] args) {


        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {1,0,1}, // row with min sum
        };

        System.out.println(Arrays.deepToString(swapFirstRowWithMinRow(arr)));
                  //   {1,0,1}
                  //   {4,5,6}
                  //   {1,2,3}

    }
    public static int[][] swapFirstRowWithMinRow(int[][] arr){

        int[] temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }

        }

        return arr;
    }
}






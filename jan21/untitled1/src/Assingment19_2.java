import java.util.Arrays;

public class Assingment19_2 {
    public static void main(String[] args) {


        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {1,0,1}, // row with min sum
        };

        System.out.println(Arrays.deepToString(findMinRow(arr)));
                  //   {1,0,1}
                  //   {4,5,6}
                  //   {1,2,3}

    }
    public static int[][] findMinRow(int[][] a) {

//array for the sums of the rows
        int[] sums = new int[a.length];

        System.out.println("Length: " + sums.length);
        int rowSum = 0;

        for (int i = 0; i < a.length; i++) {
            //reset the sum back to zero
            rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j]; //
                System.out.println("Row Sum is: " + rowSum);
            }
            //add the sums of each row to the sums array
            sums[i] = rowSum;
        }
        System.out.println(Arrays.toString(sums));
        //to keep track of the index
        int minRowIndex = 0;
        int minValue = sums[0];
        for (int i = 0; i < sums.length; i++) {
            //to find min
            if (sums[i] < minValue) {
                minValue = sums[i];
            }
            //compare to find which index is min
            if (sums[i] == minValue)
                //index is the i value that makes this if condition true
                minRowIndex = i;
        }
        System.out.println(minRowIndex);

        //swap first and min row
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int temp = a[0][j];
//                System.out.println(a[minRowIndex][j]);
                a[0][j] = a[minRowIndex][j];//0
                a[minRowIndex][j] = temp;

            }
        }


        return a;

    }}






















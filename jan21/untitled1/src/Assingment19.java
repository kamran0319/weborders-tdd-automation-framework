import java.util.Arrays;

class Assingment19 {
    public static void main(String[] args) {

        int[][] arr = {
                {6, 7, 9, 4, 8},//34
                {3, 2, 7, 4, 1},//17
                {9, 4, 5, 8, 9} // 35 row with min sum
        };
        System.out.println(Arrays.deepToString(SwapRowMin(arr)));
    }
    public static int[][] SwapRowMin(int[][] arr) {
        int[] sums = new int[arr.length];
        int totalOfRow = 0;
        for (int i = 0; i < arr.length; i++) {
            totalOfRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                totalOfRow = totalOfRow + arr[i][j];
            }
//            System.out.println("Row Sum is: " + totalOfRow);
            sums[i] = totalOfRow;
        }
//        System.out.println(Arrays.toString(sums));

        int rowIndex = 0;
        int minValue = sums[0];
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] < minValue) {
                minValue = sums[i];
            }
            if (sums[i] == minValue) {
                rowIndex = i;
            }
        }
//        System.out.println(rowIndex);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[0][j];
                arr[0][j] = arr[rowIndex][j];//0
                arr[rowIndex][j] = temp;
            }
        }
        return arr;
    }
}







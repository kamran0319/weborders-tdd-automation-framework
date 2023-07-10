import java.util.Arrays;

public class Lab096 {
    public static void main(String[] args) {
        int[][] a = {
                {5,2,3,7},
                {1,5,2,2},
                {1,2,3,4}
        };
        System.out.println(sumRow(a,2)); //should print 10
        System.out.println(sumRow(a,0)); //should print 17
    }
    public static int sumRow(int[][] array, int row) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
                  if(Arrays.equals(array[i],array[row])){
                      for (int j = 0; j <array[i].length; j++) {
                          sum+=array[i][j];

                      }
                      return sum;
                  }
        }

return 0;

    }
}

import java.util.Arrays;

public class Lab097 {
    public static void main(String[] args) {
        int[][] a = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        System.out.println(max2Delement(a)); //should be 8
    }
    public static int max2Delement(int[][] nums){


        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {

            }
            Arrays.sort(nums[i]);
        }
        System.out.println(Arrays.deepToString(nums));
        int temp=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                temp=nums[i][j];
                if (temp<nums[i][j]){
                    temp=nums[i][j];
                }
//                System.out.print(nums[i][j]+" ");
            }
//            System.out.println(temp);
        }

return temp;
    }
}

public class Lab094_1 {
    public static void main(String[] args) {
        //TESTS
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1, 2, 1})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {6,2})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {2,1,4,1})); //-> true
//        System.out.println(contains(new int[]{1, 6, 2, 1, 4, 1, 2, 1, 8}, new int[] {1,4,2})); //-> false

        System.out.println(contains(new int[]{3, 5, 1, 6, 8, 5, 2}, new int[]{5, 1, 6, 8})); //-> true
//        System.out.println(contains(new int[]{4, 5, 1, 6, 8}, new int[]{4, 1, 8})); //-> false
//        System.out.println(contains(new int[]{4, 5, 1, 6, 4, 1, 8}, new int[]{4, 1, 8})); //-> false

    }

    public static boolean contains(int[] arr1, int[] arr2) {
        //method implementation here

        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            int count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i + j]) {
                    count++;
                }
                if (count == arr2.length) {

                    return true;
                }
            }
        }
        return false;
    }
}
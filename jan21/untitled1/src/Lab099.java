public class Lab099 {
    public static void main(String[] args) {
        //Test your methods by passing the given arrays
        int[] arr1 = {3,2,5,1,6};
        double [] arr2 = {2.3 ,6.1 , 9.1 , 2.9};
        getAverage(arr1);
        getAverage(arr2);
//        System.out.println(getAverage(arr1));
    }

    //create your methods
    public static void getAverage(int[] arr1){
        int sum=0;
        int index=0;
        for (int i = 0; i < arr1.length; i++) {
            index=i+1;
            sum+=arr1[i];

        }
//        System.out.println(index);
        System.out.println(sum/index);
    }
    public static void getAverage(double[] arr2){
        double sum=0.0;
        double index=0.0;
        for (int i = 0; i < arr2.length; i++) {
            index=i+1.0;
            sum+=arr2[i];

        }
//        System.out.println(index);
        System.out.println(sum/index);
    }
}
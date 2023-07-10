import java.util.ArrayList;

public class LAB133 {


    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(makeTwo(list)); // [4,4,5,5,6,6]

    }
    public static ArrayList<Integer> makeTwo(ArrayList<Integer> nums){

        ArrayList<Integer> doubleInt =new ArrayList<>();
             for(Integer num:nums){
                 doubleInt.add(num);
                 doubleInt.add(num);


             }

        return doubleInt;
    }
    }




import java.util.ArrayList;

public class LAB131 {


    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(0);
        list.add(1);
        list.add(7);

        multiplyByTwo(list);

        System.out.println(list); // [8,4,10,20,0,2,14]

    }


    public static void multiplyByTwo(ArrayList<Integer> nums){



        for (int i = 0; i < nums.size(); i++) {
           int multipleTwo=nums.get(i)*2;
            nums.set(i,multipleTwo);

        }

    }
    }


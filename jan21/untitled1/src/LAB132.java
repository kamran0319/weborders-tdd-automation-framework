import java.util.ArrayList;
import java.util.List;

public class LAB132 {


    public static void main(String[] args){
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);

        duplicate(list);

        System.out.println(list); // [true,false,true,true,false,true]

    }


    public static void duplicate(ArrayList<Boolean> bools) {

                  bools.addAll(bools);
    }
    }




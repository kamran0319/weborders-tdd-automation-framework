import java.util.Scanner;

public class feb14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();




        if(word.substring(word.length()-2)
                .equals("ey")){
            System.out.println("-eys");
        }else if(word.charAt(word.length()-1)=='y'){
            System.out.println("-ies");
        }else if(word.substring(word.length()-3).equals("ife")){
            System.out.println("-ives");
        }else {
            System.out.println("-s");
        }
        }




    }



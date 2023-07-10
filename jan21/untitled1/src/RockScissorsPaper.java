//import java.util.Scanner;
//
//public class RockScissorsPaper {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter 1 for Rock, 2 for Paper, and 3 for Scissors:");
//        int Rock =1;
//        int Paper =2;
//        int Scissors =3;
//       int comp =(int)(Math.random()*3);
//
//       int user =input.nextInt();
//       switch (user){
//           case 1:
//               if(comp==2){
//                   System.out.println("You chose Rock. Computer chose Paper. You Lost!");
//               } else if (comp==3) {
//                   System.out.println("You chose Rock. Computer chose Scissors. You Won!");
//
//               }else {
//                   System.out.println("You chose Rock. Computer chose Rock. Draw!");
//               }
//               break;
//           case 2:
//               if(comp==1){
//                   System.out.println("You chose Paper. Computer chose Rock. You Won!");
//               } else if (comp==3) {
//                   System.out.println("You chose Paper. Computer chose Scissors. You Lost!");
//
//               }else {
//                   System.out.println("You chose Paper. Computer chose Paper. Draw!");
//               }
//               break;
//           case 3:
//               if(comp==1){
//                   System.out.println("You chose Scissors. Computer chose Rock. You Lost!");
//               }else if(comp==2){
//                   System.out.println("You chose Scissors. Computer chose Paper. You Won!");
//               }else{
//                   System.out.println("You chose Scissors. Computer chose Scissors. Draw!");
//               }
//               break;
//           default:
//               System.out.println("Invalid choice.");
//               break;
//       }
//
//
//
//
//
//
//    }
//}
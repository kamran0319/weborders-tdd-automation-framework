 class feb5 {


        public static void main(String[] args){


            System.out.println( getMessage("Monday"));
            System.out.println( getMessage("Tuesday"));
            System.out.println( getMessage("Friday"));
            System.out.println( getMessage("Sunday"));
            System.out.println( getMessage("BlaBladay"));

        }

     //create the method here
     public static String getMessage(String day){
         return switch (day){
             case "Monday","Tuesday","Wednesday","Thursday"-> "Working Hard!!!";
             case "Friday"->"The weekend is almost here! TGIF!!!";
             case  "Saturday","Sunday"->"It's party time! Alright, Alright, Alright!";
             default->"You partied too hard this weekend, bro!";

         };

     }
}






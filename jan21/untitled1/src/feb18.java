public class feb18 {
    public static void main(String[] args) {

        displayDaysOfMonth(1,2020);// January 2020 has 31 days
        displayDaysOfMonth(2,2016);// February 2016 has 29 days
        displayDaysOfMonth(2,2021);// February 2021 has 28 days
        displayDaysOfMonth(4,2000);// April 2000 has 30 days
        displayDaysOfMonth(12,2019);// December 2019 has 31 days
        displayDaysOfMonth(9,1999);// September 1999 has 30 days

    }
    public static void displayDaysOfMonth(int month, int year){
        //implement the method here

          if(month==1&&(year%4==0||year%4!=0)){
            System.out.println("January "+year+" has 31 days");
        }else if(month==2&&year%4==0){
              System.out.println("February "+year+" has 29 days");
          }else if(month==2&&year%4!=0){
              System.out.println("February "+year+" has 28 days");
          }else if(month==3&&(year%4==0||year%4!=0)){
              System.out.println("March "+year+" has 31 days");
          }else if(month==4&&(year%4==0||year%4!=0)){
              System.out.println("April "+year+" has 30 days");
          }else if(month==5&&(year%4==0||year%4!=0)){
              System.out.println("May "+year+" has 31 days");
          }else if(month==6&&(year%4==0||year%4!=0)){
              System.out.println("June "+year+" has 30 days");
          }else if(month==7&&(year%4==0||year%4!=0)){
              System.out.println("July "+year+" has 31 days");
          }else if(month==8&&(year%4==0||year%4!=0)){
              System.out.println("August "+year+" has 31 days");
          }else if(month==9&&(year%4==0||year%4!=0)){
              System.out.println("September "+year+" has 30 days");
          }else if(month==10&&(year%4==0||year%4!=0)){
              System.out.println("October "+year+" has 31 days");
          }else if(month==11&&(year%4==0||year%4!=0)){
              System.out.println("November "+year+" has 30 days");
          }else if(month==12&&(year%4==0||year%4!=0)){
              System.out.println("Desember "+year+" has 31 days");
          }else{
              System.out.println("Incorrect month or year.");
          }


        }


}

package March8;

public class GasTank {
    double amount=0;
    double capacity;

    public GasTank(double temp1) {
        this.capacity=temp1;
    }
    public void addGas(double temp2){
          amount+=temp2;
          if (amount>capacity){
              capacity=amount;
// A method named addGas that accepts a parameter of type double.
// The value of the amount instance variable is increased by the value of the parameter.
// However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
          }
    }

     public void useGas(double temp3){
            amount-=temp3;
            if(amount<0){
                amount=0;
// A method named useGas that accepts a parameter of type double.
// The value of the amount instance variable is decreased by the value of the parameter.
// However, if the value of amount is decreased below 0, amount is set to 0.
            }
}
      public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }
        return false;
// A method named isEmpty that accepts no parameters.
// isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.
      }
    public boolean isFull(){
        if(amount>0.1){
            return true;
        }
        return false;
// A method named isFull that accepts no parameters.
// isFull returns a boolean value: true if the value of amount is greater than capacity-0.1, and false otherwise.
    }
    public double getGasLevel(){

        return amount;
// A method named getGasLevel that accepts no parameters.
// getGasLevel returns the value of the amount instance variable.
    }
    public double fillUp(){
        capacity+=amount;
        return capacity-amount;
//        A method named fillUp that accepts no parameters.
//        fillUp increases amount to capacity and returns
//        the difference between the value of capacity and the original value of amount
//        (that is, the amount of gas that is needed to fill the tank to capacity).
    }
}

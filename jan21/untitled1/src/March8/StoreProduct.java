package March8;

public class StoreProduct {
    String label;
    int price;
    String category= "misc";
    boolean hasExpiration=false;
    int stock;


    public StoreProduct(){

    }

    public StoreProduct(String label, int price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price) {

        this.label = label;
        this.price = price;


    }

    public StoreProduct(String label, int price,boolean hasExpiration,String category) {

        this.label = label;
        this.price = price;
        this.hasExpiration=hasExpiration;
        this.category=category;
    }
    public void expired(boolean hasExpired){
        if (hasExpired==true){
            this.stock=0;
        }
    }
    public boolean sell(int quantity){
        if(stock>=quantity){
           this.stock-=quantity;
            return true;
        }
        return false;
    }
    public double getDiscountedPrice(double discount){

        return price*(1-0.25);
    }


}

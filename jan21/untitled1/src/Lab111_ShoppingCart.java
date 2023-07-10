public class Lab111_ShoppingCart {

    private int totalNumberOfItems=0;
    private double totalAmountOwed=0.0;

    public String getTotalNumberOfItems() {
        return "The total item number is: "+totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public String getTotalAmountOwed() {
        return "The total amount is: "+totalAmountOwed;
    }

    public void setTotalAmountOwed(double totalAmountOwed) {
        this.totalAmountOwed = totalAmountOwed;
    }
    public String getAveragePricePerItem(){
       double pricePerItem=totalAmountOwed / totalNumberOfItems;
        return "The prise per item is : "+pricePerItem;
    }
    public void addItems(int numberOfItems, double pricePerItem){
        totalAmountOwed=totalAmountOwed+(pricePerItem * numberOfItems);
        totalNumberOfItems=totalNumberOfItems+numberOfItems;
    }
    public void empty(){
        totalNumberOfItems=0;
        totalAmountOwed=0.0;
    }
}

class ShoppingCartTest {
    public static void main(String[] args) {
        //Test your class
        Lab111_ShoppingCart lab111ShoppingCart =new Lab111_ShoppingCart();
        lab111ShoppingCart.setTotalNumberOfItems(10);
        System.out.println(lab111ShoppingCart.getTotalNumberOfItems());
        lab111ShoppingCart.setTotalAmountOwed(200.0);
        System.out.println(lab111ShoppingCart.getTotalAmountOwed());
        System.out.println(lab111ShoppingCart.getAveragePricePerItem());
        lab111ShoppingCart.addItems(5,15.0);


        System.out.println("After adding items "+ lab111ShoppingCart.getAveragePricePerItem());

    }
}
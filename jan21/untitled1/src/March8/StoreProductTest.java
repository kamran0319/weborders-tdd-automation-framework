package March8;

public class StoreProductTest {
    public static void main(String[] args) {
        StoreProduct product=new StoreProduct("Tea",15,18);
        product.expired(false);
        System.out.println(product.stock);

        StoreProduct product1=new StoreProduct("chocalate",4);
        System.out.println(product1.sell(3));

        StoreProduct product2=new StoreProduct("Mozzarella",12);
        System.out.println(product2.getDiscountedPrice(0.25));
    }
}

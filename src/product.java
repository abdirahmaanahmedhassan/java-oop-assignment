public class product {
    private String productid;
    private String productName;
    private double price;
    private int quantity;

    public product (String productid,String productName, double price,int quantity){
        this.productid = productid;
        this.productName=productName;
        if (price>=0){
            this.price=price;
        }else {
            this.price=0;
        }
        if (quantity>=0){
          this.quantity=quantity;}
        else {
            this.quantity=0;
        }
    }
    public void displayproductinfo(){
        System.out.println("prduct id:"+ productid);
        System.out.println("price "+ price);
        System.out.println("quantity"+quantity);
    }
}

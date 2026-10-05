public class mainclass {
    public static void main(String[] args){
        product p1=new product("p01","laptop",800,5);
        product p2=new product("p02","phone",300,3);
        product p3=new product("p03","mouse",20,3);
        product p4=new product("p04","headphones",10,3);

        p1.displayproductinfo();
        System.out.println();
        p2.displayproductinfo();
        System.out.println();
        p3.displayproductinfo();
        System.out.println();
        p4.displayproductinfo();


    }


}

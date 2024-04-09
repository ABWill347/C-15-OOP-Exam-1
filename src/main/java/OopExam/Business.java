package OopExam;

public class Business implements Payable {
    private String name;
    private  int productQtySupplied;
    private double productPrice;

    public int getProductQtySupplied() {
        return productQtySupplied;
    }

    public void setProductQtySupplied(int productQtySupplied) {
        this.productQtySupplied = productQtySupplied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public Business(String name,int productQtySupplied ,double productPrice){
        this.name=name;
        this.productPrice=productPrice;
        this.productQtySupplied=productQtySupplied;

    }
}

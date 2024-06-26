package Ecommercefpt.entities;

public class Product extends Entity<Integer> {
    private int productId;
    private double price;
    private String productName;
    private String productDesc;


    public Product(Integer id) {
        super(id);
    }

    public Product(Integer id, int productId, double price, String productName, String productDesc) {
        super(id);
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.productDesc = productDesc;
    }

//    public Product() {
//        super();
//    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
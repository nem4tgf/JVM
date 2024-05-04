package Ecommercefpt.entities;

public class Product {
    private int productId;
    private double price;
    private String productName;
    private String productDesc;

    public Product() {
    }

    public Product(int productId, double price, String productName, String productDesc) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.productDesc = productDesc;
    }

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
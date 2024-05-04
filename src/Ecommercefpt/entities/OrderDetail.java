package Ecommercefpt.entities;

public class OrderDetail {
    private int id;
    private int quantity;
    private String date;

    public OrderDetail() {
    }

    public OrderDetail(int id, int quantity, String date) {
        this.id = id;
        this.quantity = quantity;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

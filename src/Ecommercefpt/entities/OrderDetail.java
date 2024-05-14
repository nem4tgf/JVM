package Ecommercefpt.entities;

public class OrderDetail extends Entity<Integer> {
    private int id;
    private int quantity;
    private String date;


    public OrderDetail(Integer id, int id1, int quantity, String date) {
        super(id);
        this.id = id1;
        this.quantity = quantity;
        this.date = date;
    }

    public OrderDetail(Integer id) {
        super(id);
    }

    @Override
    public Integer getId() {
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

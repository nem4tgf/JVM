package Ecommercefpt.entities;

public class Order extends Entity<Integer> {
private int order_id;
private String order_info;


    public Order(Integer id) {
        super(id);
    }

    public Order(Integer id, int order_id, String order_info) {
        super(id);
        this.order_id = order_id;
        this.order_info = order_info;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_info() {
        return order_info;
    }

    public void setOrder_info(String order_info) {
        this.order_info = order_info;
    }
}

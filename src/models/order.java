package models;

import java.util.ArrayList;

public class order {
    int orderId;
    ArrayList<BookOrder> bookOrders;

    public order(int orderId, ArrayList<BookOrder> bookOrders) {
        this.orderId = orderId;
        this.bookOrders = bookOrders;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(ArrayList<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }

}

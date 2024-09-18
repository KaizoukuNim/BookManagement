package models;

import java.util.ArrayList;

public class Main {


        public static void main(String[] args) {
            Genre g1 = new Genre("Fiction", "Not real");
            Genre g2 = new Genre("Experience", "real");

            Book b1 = new Book("yello",1000,"me", false, g1);
            Book b2 = new Book("hello",1000,"me", false, g2);
            Book b3 = new Book("fellow",1000,"me", false, g1);
            BookOrder bo1= new BookOrder(b1,3);
            BookOrder bo2= new BookOrder(b2,2);
            BookOrder bo3= new BookOrder(b3,1);
            ArrayList<BookOrder> bookOrders = new ArrayList<BookOrder>();
            bookOrders.add(bo1);
            bookOrders.add(bo2);
            bookOrders.add(bo3);
            order order1 = new order(1234, bookOrders);

        }

    }


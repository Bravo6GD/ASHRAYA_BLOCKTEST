import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Tshirt","Ck",5561,1234);
        Items item2 = new Items("pants","Lewis",5562,2345);
        Items item3 = new Items("jackets","Gucci",5563,3456);
        Items item4 = new Items("Hoodie","Essentials",5564,4567);
        Items item5 = new Items("trousers","nike",5565,5678);
        Items item6 = new Items("Shoes","puma",5566,6789);

        ArrayList <Items> order1 = new ArrayList<Items>();
        order1.add(item1);
        order1.add(item2);
        order1.add(item3);


        ArrayList<Items> order2 = new ArrayList<>();
        order2.add(item4);
        order2.add(item5);
        order2.add(item6);

        ArrayList<Items> order3 = new ArrayList<>();
        order3.add(item1);
        order3.add(item5);
        order3.add(item3);

        ArrayList<Items> order4 = new ArrayList<>();
        order4.add(item5);
        order4.add(item6);
        order4.add(item1);

        Orders ord1 = new Orders(order1,1);
        Orders ord2 = new Orders(order2,2);
        Orders ord3 = new Orders(order3,3);
        Orders ord4 = new Orders(order4,4);

        ArrayList<Orders> user_order1 = new ArrayList<Orders>();
        user_order1.add(ord1);
        user_order1.add(ord2);
        user_order1.add(ord3);

        ArrayList<Orders> user_order2 = new ArrayList<Orders>();
        user_order2.add(ord2);
        user_order2.add(ord1);
        user_order2.add(ord3);

        ArrayList<Orders> user_order3 = new ArrayList<Orders>();
        user_order3.add(ord4);
        user_order3.add(ord2);
        user_order3.add(ord1);

        Users user1 = new Users(user_order1,1);
        Users user2 = new Users(user_order2,2);
        Users user3 = new Users(user_order3,3);

        item1.print_items();
        item2.print_items();
        item3.print_items();
        item4.print_items();
        item5.print_items();

    }

}
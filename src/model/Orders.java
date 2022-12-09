package model;

import java.util.ArrayList;

public class Orders {

    ArrayList<Items> MainOrder = new ArrayList<Items>();
    int order_id;

    public ArrayList<Items> getMainOrder() {
        return MainOrder;
    }

    public void setMainOrder(ArrayList<Items> mainOrder) {
        MainOrder = mainOrder;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }



    public Orders(ArrayList<Items> mainOrder, int order_id) {
        MainOrder = mainOrder;
        this.order_id = order_id;
    }


}
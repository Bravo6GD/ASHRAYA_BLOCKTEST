package model;

import java.util.ArrayList;

public class Users {
    ArrayList<Orders> user_order= new ArrayList<>();
    int user_id;

    public ArrayList<Orders> getUser_order() {
        return user_order;
    }

    public void setUser_order(ArrayList<Orders> user_order) {
        this.user_order = user_order;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }



    public Users(ArrayList<Orders> user_order, int user_id) {
        this.user_order = user_order;
        this.user_id = user_id;
    }


}
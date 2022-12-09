package model;

public class Items {
    String type;
    String Brand;
    int code;
    int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public Items(String type, String brand, int code, int price) {
        this.type = type;
        Brand = brand;
        this.code = code;
        this.price = price;
    }
    public void print_items() {
        System.out.println("Item Name: " + this.type );
        System.out.println( " Code : " + this.code );
        System.out.println(" Brand :" + this.Brand);
        System.out.println(" Price :" + this.price);

    }


}
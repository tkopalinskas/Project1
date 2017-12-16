package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Product {

    private int id;
    private String name;
    private String image;
    private String discription;
    private double price;

    public Product(){

    }
    @Autowired
    public Product(int id, String name, String image, String discription, double price) {

        this.id = id;
        this.name = name;
        this.image = image;
        this.discription = discription;
        this.price = price;
    }
    public void setProduct(int id, String name, String image, String discription, double price){
        this.id = id;
        this.name = name;
        this.image = image;
        this.discription = discription;
        this.price = price;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDiscription() {
        return discription;
    }

    public double getPrice() {
        return price;
    }

}

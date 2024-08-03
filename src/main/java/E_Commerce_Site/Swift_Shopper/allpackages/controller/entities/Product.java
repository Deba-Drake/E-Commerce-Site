package E_Commerce_Site.Swift_Shopper.allpackages.controller.entities;

import jakarta.persistence.*;

@Entity
//@Getter
//@Setter
//@ToString
public class Product
{

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //The unique id of the product

//    @Column(name = "product_name")
    private String name;


//    private String description;
//    private String category; //The category it belongs to (like: clothing,electronics,grocery)
//    private String brand;
    private double price; //The price of the product (change as per region)
    private String currency; //The currency of the product (default: INR)
    private long stock_quantity; //The quantity/units of product available at the moment
//    private int weight;
//    private int length;
//    private int width;
//    private int height;
//    private String colour;
//    private String size; //The size of the product if any (like: M/S/XXL)
//    private String material;
//    private short average_customer_ratings;
//    private String customer_reviews;
//    private short customer_rating;
//    private String supplier;

    private boolean refundable;
    private boolean returnable;
//    private short warranty_years;

    public Product(){}

    public Product(Integer id, String name, double price, String currency, long stock_quantity,  boolean refundable, boolean returnable) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.stock_quantity = stock_quantity;
        this.refundable = refundable;
        this.returnable = returnable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(long stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public boolean isReturnable() {
        return returnable;
    }

    public void setReturnable(boolean returnable) {
        this.returnable = returnable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", refundable=" + refundable +
                ", returnable=" + returnable +
                '}';
    }
}

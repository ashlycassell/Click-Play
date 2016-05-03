package click_play;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean
@Named
public class Movie {

    private int id;
    private String title;
    private int stock;
    private double price;
    private String discriptions;
    // we don't know until now this field so this is a place holder
    //image img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscriptions() {
        return discriptions;
    }

    public void setDiscriptions(String discriptions) {
        this.discriptions = discriptions;
    }

}

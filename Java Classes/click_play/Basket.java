package click_play;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

//@ManagedBean
@Named
@SessionScoped
public class Basket implements Serializable {

    private List<Movie> basketList = new ArrayList<>();
    private double totalPrice;

    public Basket() {

    }

    public List<Movie> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Movie> basketList) {
        this.basketList = basketList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    ///////////////////////Functionality//////////////////////
    public void inStock() {

    }

    public void addToBasket(Movie m) {
        totalPrice += m.getPrice();
        basketList.add(m);
    }

    public void updateItemInBasket() {

    }

    public void removeItemFromBasket() {

    }

}

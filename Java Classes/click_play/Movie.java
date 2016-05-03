package click_play;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Movie implements Serializable {

    private int id;
    private String title;
    private String category;
    private int stock;
    private double price;
    private String description;
    // we don't know until now this field so this is a place holder
    //image img;

    MySqlConnection aConnection = new MySqlConnection();

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    ////////////////Functionality//////////////////////
    public void getMovie() {

    }

    public List<Movie> getMovies() throws SQLException {
        List<Movie> result = new ArrayList<>();
        aConnection.connect();
        String sql = "SELECT * FROM click_play.movies";
        aConnection.executeStatement(sql);
        aConnection.resutSet();
        while (aConnection.getResultSet().next()) {
            Movie movie = new Movie();
            movie.setTitle(aConnection.getResultSet().getString(2));
            result.add(movie);
        }
        aConnection.disconnect();
        return result;
    }

    public void newMovie() throws SQLException {
        aConnection.connect();
        String sql = "INSERT INTO click_play.movies (title, category, price, description, stock)"
                + "VALUES ('" + title + "', '" + category + "'," + price + ", '" + description + "' , '" + stock + "');";
        aConnection.executeStatement(sql);
        aConnection.disconnect();
    }

    public void removeMovie() {

    }

    public void updateMovie() {

    }

    public void addToBasket() {

    }

    public void removeItemFromBasket() {

    }

    public void updateItemInBasket() {

    }

}

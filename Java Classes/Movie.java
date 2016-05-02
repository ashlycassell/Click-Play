package clickClasses;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Named
@SessionScoped
public class Movie implements Serializable {

    private int id;
    private String title;
    private String category;
    private double price;
    private String description;
    private int stock;
    private Part image;

    DBConection aConnection = new DBConection();

    public Movie() {

    }

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

    public void getMovie() throws SQLException {
        aConnection.connect();

        aConnection.disconnect();
    }

    public List<Movie> getMovies() throws SQLException {
        List<Movie> result = new ArrayList<>();
        aConnection.connect();
        String sql = "SELECT * FROM click_play.movies";
        aConnection.executeStatement(sql);
        aConnection.resutSet();
        while(aConnection.getResultSet().next()){
            Movie movie = new Movie();
            movie.setTitle(aConnection.getResultSet().getString(2));
            movie.setCategory(aConnection.getResultSet().getString(3));
            movie.setPrice(aConnection.getResultSet().getDouble(4));
            movie.setDescription(aConnection.getResultSet().getString(5));
            movie.setStock(aConnection.getResultSet().getInt(6));
            result.add(movie);
        }
        aConnection.disconnect();
        return result;
    }

    public void setMovie() throws SQLException {
        aConnection.connect();
        String sql = "INSERT INTO click_play.movies (title, category, price, description, stock, image)"
                + "VALUES ('" + title + "', '" + category + "'," + price + ", '" + description + "' , '" + stock + "', '"+image+"');";
        aConnection.executeStatement(sql);
        aConnection.disconnect();
    }

    public void removeMovie() throws SQLException {
        aConnection.connect();

        aConnection.disconnect();
    }
}

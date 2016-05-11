package click_play;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

//@ManagedBean
@Named
@SessionScoped
public class Movie implements Serializable {

    private int id;
    private String title;
    private String category;
    private int stock;
    private double price;
    private String description;
    private String image;
    private String temp;
    private List<Movie> movieList;
    private List<Movie> singleMovie;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getSingleMovie() {
        return singleMovie;
    }

    public void setSingleMovie(List<Movie> singleMovie) {
        this.singleMovie = singleMovie;
    }

    ////////////////Functionality//////////////////////
    public String showMovie(Movie m) {
        if (singleMovie == null) {
            singleMovie = new ArrayList<>();
        }
        singleMovie.clear();
        singleMovie.add(m);
        return "ShowMovie";
    }

    public String showMovieAdmin(Movie m) {
        if (singleMovie == null) {
            singleMovie = new ArrayList<>();
        }
        singleMovie.clear();
        singleMovie.add(m);
        return "ShowMovieAdmin";
    }

    public List<Movie> getMovies() throws SQLException {
        movieList = new ArrayList<>();
        movieList.clear();
        aConnection.connect();
        String sql = "SELECT * FROM click_play.movies";
        aConnection.executeStatement(sql);
        aConnection.resutSet();
        while (aConnection.getResultSet().next()) {
            Movie movie = new Movie();
            movie.setId(aConnection.getResultSet().getInt(1));
            movie.setTitle(aConnection.getResultSet().getString(2));
            movie.setCategory(aConnection.getResultSet().getString(3));
            movie.setPrice(aConnection.getResultSet().getDouble(4));
            movie.setDescription(aConnection.getResultSet().getString(5));
            movie.setStock(aConnection.getResultSet().getInt(6));
            movie.setImage(aConnection.getResultSet().getString(7));
            movieList.add(movie);
        }
        aConnection.disconnect();
        return movieList;
    }

    public void newMovie() throws SQLException {
        aConnection.connect();
        String sql = "INSERT INTO click_play.movies (title, category, price, description, stock, image)"
                + "VALUES ('" + title + "', '" + category + "'," + price + ", '" + description + "' , '" + stock + "', '" + image + "');";
        aConnection.executeStatement(sql);
        aConnection.disconnect();
    }

    public void updateMovie() throws SQLException {
        aConnection.connect();
        String sql = "UPDATE click_play.movies SET title ='" +title + "' WHERE id = '" +id+ "';";
        aConnection.executeStatement(sql);
        aConnection.disconnect();
    }

    public void removeMovie() {

    }

}

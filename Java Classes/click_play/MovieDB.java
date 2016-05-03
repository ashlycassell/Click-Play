package click_play;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MovieDB implements Serializable {

    private Movie current;
    MySqlConnection aConnection = new MySqlConnection();

    public Movie getMovie() {
        Movie tempMovie = null;
        return tempMovie;
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
            movie.setCategory(aConnection.getResultSet().getString(3));
            movie.setPrice(aConnection.getResultSet().getDouble(4));
            movie.setDescription(aConnection.getResultSet().getString(5));
            movie.setStock(aConnection.getResultSet().getInt(6));
            result.add(movie);
        }
        aConnection.disconnect();
        return result;
    }

    public void createNewMovie() {

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

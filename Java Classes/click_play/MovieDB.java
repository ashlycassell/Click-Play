package click_play;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MovieDB implements Serializable {

    private Movie current;

    public Movie getMovie() {
        Movie tempMovie = null;
        return tempMovie;
    }

    public List<Movie> getMovies() {
        List<Movie> aList = null;
        return aList;
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

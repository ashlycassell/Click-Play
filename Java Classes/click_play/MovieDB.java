package click_play;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class MovieDB implements Serializable {

    private Movie current;

    public Movie getMovie() {

    }

    public List<Movie> getMovies() {

    }
    
    public void createNewMovie(){
        
    }
    
    public void removeMovie(){
        
    }
    
    public void updateMovie(){
        
    }
    
    public void addToBasket(){
        
    }
    
    public void removeItemFromBasket(){
        
    }
    
    public void updateItemInBasket(){
        
    }
}

package click_play;

import click_play.MySqlConnection;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@Named
@SessionScoped
public class Search implements Serializable {

    String searchString;
    MySqlConnection aConnection = new MySqlConnection();
    Movie movie = new Movie();
        
    public Search(){
            
       }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
        
        
        
    public List<Movie> searchByName() throws SQLException {
        List<Movie> result = new ArrayList<>();
        aConnection.connect();
        String sql = "SELECT * FROM click_play.movies WHERE Title LIKE'%"+searchString+"%';";
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

    public void searchByOrderNumber(int order) {

    }

}

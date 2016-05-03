package play_Click;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean
@Named
@SessionScoped
public class Search implements Serializable {

	String searchString;

	public void searchByName(String name) {

	}

	public void searchByOrderNumber(int order) {

	}

	public void searchByCategory() {

	}

}

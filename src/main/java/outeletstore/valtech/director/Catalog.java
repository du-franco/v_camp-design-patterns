package outeletstore.valtech.director;

import java.util.ArrayList;
import java.util.List;

import outeletstore.valtech.model.Product;

public class Catalog {
	
	public List<Product> catalogProducts = new ArrayList<Product>();
	
	public List<Product> getAllProducts(){
		return catalogProducts;
	}

}

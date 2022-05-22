package outeletstore.valtech.builder;

import outeletstore.valtech.model.Product;

public interface ProductBuilderInterface {
	
	//Created the productBuilder interface to set the variables used in all products
	
	ProductBuilderInterface setSku(int sku);
	ProductBuilderInterface setPrice(double price);
	ProductBuilderInterface setWeight(double weight);
	
	
	Product builder();
	
	Product getProduct();

}

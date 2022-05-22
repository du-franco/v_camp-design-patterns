package outeletstore.valtech.director;

import java.util.ArrayList;
import java.util.List;

import outeletstore.valtech.model.Product;

public class Cart {
	
	public double cartTotalPrice;
	public double cartTotalWeight;
	public double totalShippingValue;
	public int cartTotalProducts;
	
	/** Instancing the ProductInventory to use the methods created in the cart class
	 * List<Product>
	 * The user can access elements by their integer index (position in the list), 
	 * and search for elements in the list.
	 * */
	ProductInventory outletInventory = ProductInventory.getInstance();
	
	List<Product> cartShopping = new ArrayList<Product>();
	
	public void addCartProducts(int sku, int quantity)  {
		
		outletInventory.removeProductStock(sku, quantity);
		outletInventory.addProductStock(sku, quantity);
		
		cartShopping.add(outletInventory.getFilterProduct(sku).clone());
		takeProduct(sku).cartQuantity = quantity;
		
	}
	
	
	
	public void cartRemoveProducts(int sku, int quantity)  {
		int actualCartQuantity = cartShopping.stream().filter(product -> product.sku == sku).toList().get(0).stockQuantity;
		
		if(actualCartQuantity >= quantity) {
			outletInventory.addProductStock(sku, quantity);
		} else {
			System.out.println("Not enough products in cart.");
		}
	}
	
	public List<Product> getProduct(){
		return cartShopping;
	}
	
	public int getQuantityProductCart() {
		int cartProductQuantity = 0;
		for(Product product : cartShopping) {
			cartProductQuantity += product.cartQuantity;
		}
		return cartProductQuantity;
	}
	
	
	public double cartWeight() {
		cartTotalWeight = 0;
		cartShopping.forEach(product -> cartTotalWeight += (product.getWeight() * product.cartQuantity));
		return cartTotalWeight;
	}
	
	public double cartPrice() {
		cartTotalPrice = 0;
		cartShopping.forEach(product -> cartTotalPrice += (product.getPrice() * product.cartQuantity));
		return cartTotalPrice;
	}
	
	public Product takeProduct(int sku) {
		return cartShopping.stream().filter(product -> product.sku == sku).toList().get(0);
	}
	
	
	
 
}

package outeletstore.valtech.model;

public class Product {
	
	/**
	 * Product class, variables were created 
	 * (sku, stockQuantity, stockReserved, price, weight and cartQuantity)
	 * */
	
	public int sku;
	public int stockQuantity;
	public int stockReserved;
	public double price;
	public double weight;
	public int cartQuantity;
	
	public Product() {}
	
	/**
	 * The constructor and the getters and setter of each variable were created
	 * */

	public Product(int sku, int stockQuantity, int stockReserved, double price, double weight, int cartQuantity) {
		super();
		this.sku = sku;
		this.stockQuantity = stockQuantity;
		this.stockReserved = stockReserved;
		this.price = price;
		this.weight = weight;
		this.cartQuantity = cartQuantity;
	}
	
	
	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public int getStockReserved() {
		return stockReserved;
	}

	public void setStockReserved(int stockReserved) {
		this.stockReserved = stockReserved;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCartQuantity() {
		return cartQuantity;
	}

	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
		
	}
	
	public Product clone() {
		return this;
	}
	
	

}

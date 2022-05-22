package outeletstore.valtech.builder;

import outeletstore.valtech.model.Watch;

public class WatchModelBuilder implements ProductBuilderInterface {
	
	public int sku;
	public double price;
	public double weight;
	public int stockQuantity;
	public int stockReserved;
	public String model;
	public String bracelet;
	
	private Watch watch;
	
	@Override
	public ProductBuilderInterface setSku(int sku) {
		this.sku = sku;
		return this;
	}
	
	@Override
	public ProductBuilderInterface setPrice(double price) {
		this.price = price;
		return this;
	}
	
	@Override
	public ProductBuilderInterface setWeight(double weight) {
		this.weight = weight;
		return this;
	}
	
	public WatchModelBuilder setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		return this;
	}
	
	public WatchModelBuilder setStockReserved(int stockReserved) {
		this.stockReserved = stockReserved;
		return this;
	}
	
	public WatchModelBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	
	public WatchModelBuilder setBracelet(String bracelet) {
		this.bracelet = bracelet;
		return this;
	}
	
	@Override
	public Watch builder() {
		watch = new Watch();
		watch.sku = this.sku;
		watch.price = this.price;
		watch.weight = this.weight;
		watch.stockQuantity = this.stockQuantity;
		watch.stockReserved = this.stockReserved;
		watch.model = this.model;
		watch.bracelet = this.bracelet;
		return watch;
	}
	
	@Override
	public Watch getProduct() {
		// TODO Auto-generated method stub
		return watch;
	}
	
	

}

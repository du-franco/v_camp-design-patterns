package outeletstore.valtech.builder;

import outeletstore.valtech.model.Tennis;

public class TennisModelBuilder implements ProductBuilderInterface {

	public int sku;
	public double price;
	public double weight;
	public int stockQuantity;
	public int stockReserved;
	public String type;
	public String feature;
	
	private Tennis tennis;
	
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
	@Override
	public ProductBuilderInterface setSku(int sku) {
		this.sku = sku;
		return this;
	}
	
	public TennisModelBuilder setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		return this;
	}
	
	public TennisModelBuilder setStockReserved(int stockReserved) {
		this.stockReserved = stockReserved;
		return this;
	}
	
	public TennisModelBuilder setType(String type) {
		this.type = type;
		return this;
	}
	
	public TennisModelBuilder setFeature(String feature) {
		this.feature = feature;
		return this;
	}
	
	@Override
	public Tennis builder() {
		tennis = new Tennis();
		tennis.sku = this.sku;
		tennis.price = this.price;
		tennis.weight = this.weight;
		tennis.stockQuantity = this.stockQuantity;
		tennis.stockReserved = this.stockReserved;
		tennis.type = this.type;
		tennis.feature = this.feature;
		return tennis;
	}
	@Override
	public Tennis getProduct() {
		// TODO Auto-generated method stub
		return tennis;
	}
	
	
	
	
	
}

package outeletstore.valtech.builder;

import outeletstore.valtech.model.Tshirt;

public class TshirtModelBuilder implements ProductBuilderInterface {

	public int sku;
	public double price;
	public double weight;
	public int stockQuantity;
	public int stockReserved;
	public String color;
	public String size;
	
	private Tshirt tshirt;

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
	
	public TshirtModelBuilder setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		return this;
	}
	
	public TshirtModelBuilder setStockReserved(int stockReserved) {
		this.stockReserved = stockReserved;
		return this;
	}
	
	public TshirtModelBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public TshirtModelBuilder setSize(String size) {
		this.size = size;
		return this;
	}

	@Override
	public Tshirt builder() {
		tshirt = new Tshirt();
		tshirt.sku = this.sku;
		tshirt.price = this.price;
		tshirt.weight = this.weight;
		tshirt.stockQuantity = this.stockQuantity;
		tshirt.stockReserved = this.stockReserved;
		tshirt.color = this.color;
		tshirt.size = this.size;
		return tshirt;
	}

	@Override
	public Tshirt getProduct() {
		// TODO Auto-generated method stub
		return tshirt;
	}

	
}

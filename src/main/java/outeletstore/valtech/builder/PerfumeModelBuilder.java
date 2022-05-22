package outeletstore.valtech.builder;

import outeletstore.valtech.model.Perfume;

public class PerfumeModelBuilder implements ProductBuilderInterface{
	
	
		public int sku;
		public double price;
		public double weight;
		public int stockQuantity;
		public int stockReserved;
		public String gender;
		public String fragrance;
		
		private Perfume perfume;
		

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
		
		
		public PerfumeModelBuilder setStockQuantity(int quantity) {
			this.stockQuantity = quantity;
			return this;
		}
		
		public PerfumeModelBuilder setStockReserved(int quantity) {
			this.stockReserved = quantity;
			return this;
		}
		
		public PerfumeModelBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public PerfumeModelBuilder setFragrance(String fragrance) {
			this.fragrance = fragrance;
			return this;
		}

		@Override
		public Perfume builder() {
			perfume = new Perfume();
			perfume.sku = this.sku;
			perfume.price = this.price;
			perfume.weight = this.weight;
			perfume.stockQuantity = this.stockQuantity;
			perfume.stockReserved = this.stockReserved;
			perfume.gender = this.gender;
			perfume.fragrance = this.fragrance;
			return perfume;
		}

		@Override
		public Perfume getProduct() {
			return perfume;
		}

		
		
}

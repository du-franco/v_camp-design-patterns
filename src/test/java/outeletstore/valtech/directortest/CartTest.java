package outeletstore.valtech.directortest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collections;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import outeletstore.valtech.builder.PerfumeModelBuilder;
import outeletstore.valtech.builder.TennisModelBuilder;
import outeletstore.valtech.director.Cart;
import outeletstore.valtech.director.ProductInventory;
import outeletstore.valtech.model.Perfume;
import outeletstore.valtech.model.Product;
import outeletstore.valtech.model.Tennis;

public class CartTest {
	
	@BeforeClass
	public static void cartTest() {
		
		PerfumeModelBuilder perfumeBuilder = new PerfumeModelBuilder();
		perfumeBuilder.setSku(1).setPrice(99.90).setWeight(1);
		perfumeBuilder.setStockQuantity(10).setStockReserved(0);
		perfumeBuilder.setGender("Male").setFragrance("Woody");
		Perfume perfume = perfumeBuilder.builder();
		
		TennisModelBuilder tennisBuilder = new TennisModelBuilder();
		tennisBuilder.setSku(2).setPrice(159.90).setWeight(2);
		tennisBuilder.setStockQuantity(10).setStockReserved(0);
		tennisBuilder.setType("Run").setFeature("With shock absorber");
		Tennis tennis = tennisBuilder.builder();
		
		
		Collections.addAll(ProductInventory.getInstance().stock, perfume, tennis);
		
	}
	
	@After
	public void findInventory() {
		for(Product product : ProductInventory.getInstance().stock) {
			product.stockQuantity = 10;
			product.stockReserved = 0;
			product.cartQuantity = 0;
		}
		
	}
	
	
	
	@Test
	public void addProductCart()throws Exception{
		Cart cart = new Cart();
		
		cart.addCartProducts(1, 1);
		
		assertThat(cart.getQuantityProductCart(), is(1));
		assertThat(cart.cartPrice(), is(99.90));
		assertThat(cart.cartWeight(), is(1.0));
	}
	
	@Test
	public void addMoreProductInventory() throws Exception {
		Cart cart = new Cart();
		
		cart.addCartProducts(1 , 1);
	}
	
 
}

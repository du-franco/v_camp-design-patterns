package outeletstore.valtech.buildertest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import outeletstore.valtech.builder.TshirtModelBuilder;
import outeletstore.valtech.model.Tshirt;

public class TshirtModelBuilderTest {
	
	@Test
	public void tshirtBuilderTest() {
		
		TshirtModelBuilder tshirtBuilder = new TshirtModelBuilder();
		tshirtBuilder.setSku(3).setPrice(49.90).setWeight(1);
		tshirtBuilder.setStockQuantity(10).setStockReserved(0);
		tshirtBuilder.setColor("Black").setSize("Large");
		Tshirt tshirt = tshirtBuilder.builder();
		
		assertTrue(tshirt.getSku() == 3);
		assertTrue(tshirt.getPrice() == 49.90);
		assertTrue(tshirt.getWeight() == 1);
		assertTrue(tshirt.getStockQuantity() == 10);
		assertTrue(tshirt.getStockReserved() == 0);
		assertTrue(tshirt.getColor() == "Black");
		assertTrue(tshirt.getSize() == "Large");
	}

}

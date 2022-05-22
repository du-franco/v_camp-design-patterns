package outeletstore.valtech.buildertest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import outeletstore.valtech.builder.TennisModelBuilder;
import outeletstore.valtech.model.Tennis;

public class TennisModelBuilderTest {
	
	@Test
	public void tennisBuilderTest() {
		
		TennisModelBuilder tennisBuilder = new TennisModelBuilder();
		tennisBuilder.setSku(2).setPrice(159.90).setWeight(2);
		tennisBuilder.setStockQuantity(10).setStockReserved(0);
		tennisBuilder.setType("Run").setFeature("With shock absorber");
		Tennis tennis = tennisBuilder.builder();
		
		assertTrue(tennis.getSku() == 2);
		assertTrue(tennis.getPrice() == 159.90);
		assertTrue(tennis.getWeight() == 2);
		assertTrue(tennis.getStockQuantity() == 10);
		assertTrue(tennis.getStockReserved() == 0);
		assertTrue(tennis.getType() == "Run");
		assertTrue(tennis.getFeature() == "With shock absorber");
	}

}

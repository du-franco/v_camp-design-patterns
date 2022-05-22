package outeletstore.valtech.buildertest;

import static org.junit.Assert.assertTrue;

import outeletstore.valtech.builder.WatchModelBuilder;
import outeletstore.valtech.model.Watch;

public class WatchModelBuilderTest {
	
	public void watchBuilderTest() {
		
		WatchModelBuilder watchBuilder = new WatchModelBuilder();
		watchBuilder.setSku(4).setPrice(199.90).setWeight(1);
		watchBuilder.setStockQuantity(10).setStockReserved(0);
		watchBuilder.setModel("Analog").setBracelet("Steel bracelet");
		Watch watch = watchBuilder.builder();
		
		assertTrue(watch.getSku() == 4);
		assertTrue(watch.getPrice() == 199.90);
		assertTrue(watch.getWeight() == 1);
		assertTrue(watch.getStockQuantity() == 10);
		assertTrue(watch.getStockReserved() == 0);
		assertTrue(watch.getModel() == "Analog");
		assertTrue(watch.getBracelet() == "Steel bracelet");
		
	}

}

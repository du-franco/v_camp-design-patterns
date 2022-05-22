package outeletstore.valtech.buildertest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import outeletstore.valtech.builder.PerfumeModelBuilder;
import outeletstore.valtech.model.Perfume;

public class PerfumeModelBuilderTest {
	
	@Test
	public void perfumeBuilderTest() {
		
		PerfumeModelBuilder perfumeBuilder = new PerfumeModelBuilder();
		perfumeBuilder.setSku(1).setPrice(99.90).setWeight(1);
		perfumeBuilder.setStockQuantity(10).setStockReserved(0);
		perfumeBuilder.setGender("Male").setFragrance("Woody");
		Perfume perfume = perfumeBuilder.builder();
		
		assertTrue(perfume.getSku() == 1);
		assertTrue(perfume.getPrice() == 99.90);
		assertTrue(perfume.getWeight() == 1);
		assertTrue(perfume.getStockQuantity() == 10);
		assertTrue(perfume.getStockReserved() == 0);
		assertTrue(perfume.getGender() == "Male");
		assertTrue(perfume.getFragrance() == "Woody");
		
	}

}

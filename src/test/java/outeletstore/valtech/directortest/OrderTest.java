package outeletstore.valtech.directortest;

import static org.junit.Assert.assertTrue;

import java.util.Collections;

import org.junit.Test;

import outeletstore.valtech.builder.PerfumeModelBuilder;
import outeletstore.valtech.director.Order;
import outeletstore.valtech.director.OrderList;
import outeletstore.valtech.director.ProductInventory;
import outeletstore.valtech.model.Perfume;
import outeletstore.valtech.status.OrderStatus;

public class OrderTest {
	
	@Test
	public void orderTest() {
		
		Order order = new Order();
		
		assertTrue(order.cart != null);
		assertTrue(order.orderNumber == 1);
		assertTrue(OrderList.getInstance().listOrder.contains(order));
		assertTrue(order.orderStatus == OrderStatus.Pending);
		assertTrue(order.shippingValue == 0 && order.shippingInterface == null);
	}
	
	@Test
	public void currentShipping() throws Exception {
		
		PerfumeModelBuilder perfumeBuilder = new PerfumeModelBuilder();
		
		perfumeBuilder.setSku(1).setPrice(99.90).setWeight(1);
		perfumeBuilder.setStockQuantity(10).setStockReserved(0);
		perfumeBuilder.setGender("Male").setFragrance("Woody");
		Perfume perfume = perfumeBuilder.builder();
		
		Collections.addAll(ProductInventory.getInstance().stock, perfume);
		
		Order order = new Order();
		
		order.currentShipping();
		
		assertTrue(order.shippingInterface.shippingMethod() == " Aero ");
		assertTrue(order.cart.cartWeight() == 0);
		assertTrue(order.cart.cartPrice() == 0);
		
		order.cart.addCartProducts(1, 1);
		
		order.Paid();
		assertTrue(order.orderStatus == OrderStatus.Paid);
		order.Shipped();
		assertTrue(order.orderStatus == OrderStatus.Shipped);
		order.Completed();
		assertTrue(order.orderStatus == OrderStatus.Completed);
		order.Canceled();
		assertTrue(order.orderStatus == OrderStatus.Canceled);
		
	}

}

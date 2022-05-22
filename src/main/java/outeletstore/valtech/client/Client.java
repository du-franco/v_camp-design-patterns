package outeletstore.valtech.client;

import java.text.DecimalFormat;
import java.util.Collections;

import outeletstore.valtech.builder.PerfumeModelBuilder;
import outeletstore.valtech.builder.TennisModelBuilder;
import outeletstore.valtech.builder.TshirtModelBuilder;
import outeletstore.valtech.builder.WatchModelBuilder;
import outeletstore.valtech.director.BackOffice;
import outeletstore.valtech.director.Cart;
import outeletstore.valtech.director.Catalog;
import outeletstore.valtech.director.Order;
import outeletstore.valtech.director.OrderList;
import outeletstore.valtech.director.ProductInventory;
import outeletstore.valtech.model.Perfume;
import outeletstore.valtech.model.Product;
import outeletstore.valtech.model.Tennis;
import outeletstore.valtech.model.Tshirt;
import outeletstore.valtech.model.Watch;
import outeletstore.valtech.status.OrderStatus;

public class Client {
	
	public static void main(String[] args)  {
		
		
		
		System.out.println("---------------------Welcome Outelet Valtech---------------------");
		
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
		
		TshirtModelBuilder tshirtBuilder = new TshirtModelBuilder();
		tshirtBuilder.setSku(3).setPrice(49.90).setWeight(1);
		tshirtBuilder.setStockQuantity(10).setStockReserved(0);
		tshirtBuilder.setColor("Black").setSize("Large");
		Tshirt tshirt = tshirtBuilder.builder();
		
		WatchModelBuilder watchBuilder = new WatchModelBuilder();
		watchBuilder.setSku(4).setPrice(199.90).setWeight(1);
		watchBuilder.setStockQuantity(10).setStockReserved(0);
		watchBuilder.setModel("Analog").setBracelet("Steel bracelet");
		Watch watch = watchBuilder.builder();
		
		Catalog catalog = new Catalog();
		catalog.catalogProducts.add(perfumeBuilder.getProduct());
		catalog.catalogProducts.add(tennisBuilder.getProduct());
		catalog.catalogProducts.add(tshirtBuilder.getProduct());
		catalog.catalogProducts.add(watchBuilder.getProduct());
		
		
		Collections.addAll(ProductInventory.getInstance().stock, perfume, tennis, tshirt, watch);
		
		for(Product product : ProductInventory.getInstance().stock) {
			System.out.println(product.toString());
		}
		
		BackOffice backOffice = new BackOffice();
		OrderList.getInstance().subs(backOffice);
		
		Cart cart = new Cart();
		
		Order order = new Order();
		
		
		order.orderStatus = OrderStatus.Completed;
		
		System.out.println("-----------------------------------Buy Perfume------------------------------");
		
		ProductInventory.getInstance().addProductReserve(1, 5);
		System.out.println("Product quantity reserved perfume: "+ProductInventory.getInstance().getReservedQuantitySku(1));
		
		order.cart.addCartProducts(1, 1);
		
		
		
		System.out.println("Product: " + ProductInventory.getInstance().getFilterProduct(1));
		System.out.println("Add product to cart: " + order.cart);
		System.out.println("Total product value: " + new DecimalFormat(".##").format(order.cart.cartPrice()));
		System.out.println("Total product weight: " + order.cart.cartWeight());
		System.out.println("Total product: " + perfume.cartQuantity);
		System.out.println("-----------------------------------Shipping Information-----------------------");
		order.currentShipping();
		System.out.println("[Shipping value.: $" + new DecimalFormat(".##").format(order.shippingValue) + "] [Total value of products and shipping.: $" + new DecimalFormat(".##").format(order.totalValue) + "] [Shipping method.: " + order.shippingInterface.shippingMethod() + "]");
		System.out.println("Order status: " + order.orderStatus.toString());

	}

}

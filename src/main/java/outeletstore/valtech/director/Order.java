package outeletstore.valtech.director;

import outeletstore.valtech.model.Product;
import outeletstore.valtech.shipping.ShippingInterface;
import outeletstore.valtech.shipping.ShippingMethod;
import outeletstore.valtech.status.OrderStatus;

public class Order {
	
	public Cart cart = new Cart();
	
	public ShippingInterface shippingInterface;
	
	public  OrderStatus orderStatus = OrderStatus.Pending;
	
	public double shippingValue;
	public double totalValue;
	public int orderNumber;
	
	public Order() {
		OrderList.getInstance().listOrder.add(this);
		orderNumber = OrderList.getInstance().listOrder.size();
	}
	
	public void Paid() throws Exception {
		this.orderStatus = OrderStatus.Paid;
		for (Product product : this.cart.cartShopping) {
			ProductInventory.getInstance().removeProductReserve(product.sku, product.cartQuantity);
		}
		OrderList.getInstance().renderOrderList(this.orderNumber);
	}
	
	public void Shipped() {
		this.orderStatus = OrderStatus.Shipped;
		OrderList.getInstance().renderOrderList(this.orderNumber);
	}
	
	public void Completed() {
		this.orderStatus = OrderStatus.Completed;
		OrderList.getInstance().renderOrderList(this.orderNumber);
	}
	
	public void Canceled() {
		this.orderStatus = OrderStatus.Canceled;
		OrderList.getInstance().renderOrderList(this.orderNumber);
	}
	
	public void currentShipping() {
		ShippingMethod shippingMethod = new ShippingMethod();
		shippingInterface = shippingMethod.obtainShipping(cart.cartWeight());
		shippingValue = shippingInterface.distribute(cart.cartPrice(), cart.getQuantityProductCart());
		totalValue = shippingValue + cart.cartPrice();
		OrderList.getInstance().renderOrderList(this.orderNumber);
		
	}

}

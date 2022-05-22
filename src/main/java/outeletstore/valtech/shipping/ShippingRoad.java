package outeletstore.valtech.shipping;

public class ShippingRoad implements ShippingInterface {
	
	public double shippingValue;

	@Override
	public Double distribute(double price, int quantity) {
		if(price <= 799) {
			 shippingValue = 7.99 + quantity;
		} else {
			 shippingValue = (price * 0.1) + quantity;
		}
		return shippingValue;
	}

	@Override
	public String shippingMethod() {
		// TODO Auto-generated method stub
		return " Road ";
	}

	

}

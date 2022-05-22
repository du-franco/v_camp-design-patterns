
package outeletstore.valtech.shipping;

public class ShippingMethod {
	
	public ShippingInterface obtainShipping(double weight) {
		if (weight > 10) {
			return new ShippingRoad();
		} else {
			return new ShippingAero();
		}
		
	}
	
	
}

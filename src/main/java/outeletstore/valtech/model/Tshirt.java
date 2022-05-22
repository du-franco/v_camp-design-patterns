package outeletstore.valtech.model;

public class Tshirt extends Product{
	
	public String color;
	public String size;
	
	
	public Tshirt() {}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		return "Tshirt:  " + "[Color: " +  this.getColor() + "]" 
		                   + "[Size: " +   this.getSize() + "]"
		                   + "[Price: " +  Double.toString(this.getPrice()) + "]"
		                   + "[Weight: " + Double.toString(this.getWeight()) + "]";
	}

}

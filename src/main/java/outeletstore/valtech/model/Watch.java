package outeletstore.valtech.model;

public class Watch extends Product {
	
	public String model;
	public String bracelet;
	
	public Watch() {}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBracelet() {
		return bracelet;
	}

	public void setBracelet(String bracelet) {
		this.bracelet = bracelet;
	}

	public String toString() {
		return "Watch:   " + "[Model: " +    this.getModel() + "]" 
		                   + "[Bracelet: " + this.getBracelet() + "]"
		                   + "[Price: " +    Double.toString(this.getPrice()) + "]"
		                   + "[Weight: " +   Double.toString(this.getWeight()) + "]";
	}

}

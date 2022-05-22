package outeletstore.valtech.model;

public class Tennis extends Product{
	
	public String type;
	public String feature;
	
	
	
	public Tennis() {}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	public String toString() {
		return "Tennis:  " + "[Type: " +     this.getType() + "]" 
		                   + "[Feature: " + this.getFeature() + "]"
		                   + "[Price: " +   Double.toString(this.getPrice()) + "]"
		                   + "[Weight: " +  Double.toString(this.getWeight()) + "]";
	}

}

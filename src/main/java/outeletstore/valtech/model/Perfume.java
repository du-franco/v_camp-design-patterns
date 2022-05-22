package outeletstore.valtech.model;

public class Perfume extends Product {
	
	public String gender;
	public String fragrance;
	
	
	
	public Perfume() {}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFragrance() {
		return fragrance;
	}
	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}
	
	public String toString() {
		return "Perfume: " + "[Gender: " +   this.getGender() + "]" 
		                   + "[Fragrance: " + this.getFragrance() + "]"
		                   + "[Price: " +     Double.toString(this.getPrice()) + "]"
		                   + "[Weight: " +    Double.toString(this.getWeight()) + "]";
		                   
	}

}

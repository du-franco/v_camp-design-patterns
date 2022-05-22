package outeletstore.valtech.director;

public class BackOffice implements Observer {


	@Override
	public void observable(int obs) {
		System.out.println("Info Order: " + obs + " |");
		
	}

}


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boat B1 = new Boat("3000","Black",2);
		
		Car C1 = new Car ("4000","White",4);
		
		Plane P1 = new Plane ("7000","Pink",2);
		
		
	    Garage myGarage = new Garage();
	    
	    myGarage.addToGarage(P1);
	    myGarage.addToGarage(C1);
	    myGarage.addToGarage(B1);
	    
	    myGarage.printing();
	    
		
		
	}

}

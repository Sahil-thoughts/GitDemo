
public class AustralianTraffic implements  CentralTraffic , ContinentalTraffic { // move cursor and select "Add unimplemented methods" and all methods will appear in this program automatically

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContinentalTraffic ct = new AustralianTraffic();
		CentralTraffic a = new AustralianTraffic(); // Note: here instead of  "AutralianTraffic" we use CentralTraffic while defining a object class
		AustralianTraffic at = new AustralianTraffic(); //here for walkonsymbol , we need to define another object 
		ct.Trainsymbol(); //here we need to create an another/ separate object as it (Trainsymbol) is from  another interface (ContinentalTraffic)
		at.walkonsymbol(); //here we need to create an another/separate object as it (walkonsymbol) is from this local  AustralianTraffic
		a.flashYellow();;
		a.greenGo();
		a.redStop();

	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		// write your code
		System.out.println("Central:green go implementaion");
		
	}
	public void walkonsymbol()
	{
		System.out.println("Walking : Australian"); // 
	}
	

@Override
public void redStop() {
	// TODO Auto-generated method stub
	// write your code
	System.out.println("Central:red Stop implementaion");
	
}

@Override
public void flashYellow() {
	// TODO Auto-generated method stub
	System.out.println("Central:flash yellow implementaion");
	
}
@Override
public void Trainsymbol() {
	// TODO Auto-generated method stub
	System.out.println("Train: Continent");
	
}

}

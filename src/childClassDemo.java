
public class childClassDemo extends parentClassdemo{
	
	int i=20;
		
		public void i()
		{
			
			System.out.println(i);
		}

	public void engine()
	
	{
	System.out.println("New Engine");
}
	
public void color()
	
	{
	System.out.println("Print the color define in parent class: "+color); //As we use "extends parentClassdemo" we can use color directly over here
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo cd = new childClassDemo();
		//cd.color();// here cd. we need to select color from child class although there is color from parent class also. 
		cd.Breakes(); //here breakes will come from parent class, if we delete "extends parentClassdemo" breakes will not getting displayed over here
		cd.engine();
		cd.color();
		//System.out.println(cd.i());
		

		cd.Gear();
		
		

	}

	
}


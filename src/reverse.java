
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print reverse of string and check whether it is palindrome e.g. MADAM
		String s = "rahul";
		String t = "";
		for (int i = s.length()-1; i>0; i--) // here -1  is necessary if we do not then it will throw error and i>=0 , other wise letter at 0 postion will not display
		{
			//System.out.println(s.charAt(i)); //this will print but in top down manner in order to join letter we need to use "Plus operator".
			t= t+s.charAt(i);
			
		}
		System.out.println("After reverse   "+t);
		if(s==t);
		{
			System.out.println("it is palindrome");
			
		}
		
		
		
			
		}
		}
		

	



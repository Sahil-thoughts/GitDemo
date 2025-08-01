
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Payment  $100 paid
		//String str = new String ("Payment$100 paid");// we can define it by this also
		String s = "Payments $100 paid"; //This simple syntax is valid only for string class. Keep a note. You cannot just define for all the class names with this simple syntax.
				s.charAt(8);// it is a method which takes index as an argument
				System.out.println("Print characater at a particular position:  "+s.charAt(0)); //here counting starts from 0 place
				s.indexOf("$"); //this statement doesnot print anything
				System.out.println(s.indexOf("a"));
				System.out.println(s.toUpperCase());
				System.out.println(s.toLowerCase());
				
				System.out.println(s.substring(9));

	}

}

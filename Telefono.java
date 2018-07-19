package codewars;

public class Telefono {
	 public static boolean validPhoneNumber(String phoneNumber) {
		    if (phoneNumber.length()==14 && phoneNumber.charAt(5)==' ' && phoneNumber.charAt(9)=='-'
		    && phoneNumber.charAt(0)=='(' && phoneNumber.charAt(4)==')' )
		      return true;
		    else
		      return false;
		  }
	public static void main(String[] args) {
		System.out.println(validPhoneNumber("(123) 456-7890"));

	}

}

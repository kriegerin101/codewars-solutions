package codewars;

public class Pin {
	  private static Exception IllegalArgumentException;
	public static boolean validatePin(String pin) {
		  try{
		   int num=Integer.parseInt(pin.trim());
		   if (num<=999999)
			    return true;
			  else
			    return false;
		  }catch(NumberFormatException e){
			  return false;
		  }
		  }
	public static void main(String[] args)  {
		System.out.println(validatePin("1234"));

	}

}

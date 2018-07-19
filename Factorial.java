package codewars;

public class Factorial {
	  public int factorial(int n) {
		  int acum=1;
		  if (n<0 || n>12)
		    throw new IllegalArgumentException();
		  else if (n==0)
		    return 1;
		  else{
		    for (int k=n;k>=1;k--){
		      acum=acum*k;
		    }
		    return acum;
		  }

		  }
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorial(5));

	}

}

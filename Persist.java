package codewars;

public class Persist {
	public static int persistence(long n) {
		// your code
    long cifra1, cifra2, cifra3, resto, acum1=0;
    int con=0;
    while (n>=9){
      cifra1=n%10;
      resto=n%100;
      cifra2=resto/10;
      cifra3=n/100;
      acum1=cifra1*cifra2*cifra3;
      con++;
      n=acum1;
    }return con;
	}
	public static void main(String[] args) {
		System.out.println(persistence(999));

	}

}

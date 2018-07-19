package codewars;

public class XFibonacci {
	
	public static void main(String[] args) {
		int n=14;
		double s[]= {3, 4, 5, 6, 8, 12, 34};
		double tab[]= new double[n];
	     int k=0;
	     while(k<n){
	       if (k==0)
	         tab[k]=s[k];
	        if (k==1)
	          tab[k]=s[k];
	        if (k==2)
	          tab[k]=s[k];
	        else
	        	tab[k]=s[k-1]+s[k-2]+s[k-3];
	        System.out.println(tab[k]);
	        k++;
	     }

	}

}

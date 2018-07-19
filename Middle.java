package codewars;

public class Middle {
	  public static String getMiddle(String word) {
		    String cad2="";
		    int p;
		    if (word.length()%2==0){
		      p=word.length()/2;
		      for (int k=0;k<word.length();k++){
		        if (p==k || p==k-1)
		          cad2= cad2+ word.charAt(k);
		      }
		    }
		    else{
		      p=word.length()/2;
		      for (int k=0;k<word.length();k++){
		        if (p==k)
		          cad2= cad2+ word.charAt(k);
		    }
		  } return cad2;
		}
	public static void main(String[] args) {
		/*int p=5/2;
		System.out.println(p);*/
		System.out.println(getMiddle("middle"));
	}

}

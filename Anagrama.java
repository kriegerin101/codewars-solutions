package codewars;

public class Anagrama {
	 public static boolean isAnagram(String test, String original) {
		  String t, o;
		 t=test.toUpperCase();
		  o=original.toUpperCase();
		    if(t.contains(o))
		      return true;
		    else
		      return false;
		  }
	public static void main(String[] args) {
		System.out.println(isAnagram("BooB", "bObO"));
		String p= "ola que ase";
		String pp;
		pp=p.toUpperCase();
		System.out.println(pp);

	}

}

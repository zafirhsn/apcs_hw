public class Driver {
    public static void main (String[] args) {
	String s = "zafir hasan";
	
	int x =  s.indexOf(" ");
        String FirstName = s.substring(0,x);
	String LastName = s.substring(x+1);

	System.out.println(FirstName);
	System.out.println(LastName);
    }
}

	

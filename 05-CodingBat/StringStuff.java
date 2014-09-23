public class StringStuff {
	public String nonStart(String a, String b) {
		String x = a.substring(1);
		String y = b.substring(1);
		return x + y;
	}
	
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	
	public int diff21(int n) {
		if (n > 21) {
			return (21 - n)*-1 * 2;
		}
		else {
			return 21-n; 
		}
	}
}
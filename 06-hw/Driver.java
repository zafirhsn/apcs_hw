public class Driver {
	public static void main(String[] args) {

	//Took me 5 minutes to do this
	public String frontTimes(String str, int n) {
		String finalString = "";
		if (str.length() < 3 || str.length() == 3) {
			while (n > 0) {
				finalString += str;
					n -= 1;  
			}
		return finalString;
		}
  
		String front = str.substring(0,3);
  
		while (n > 0) {
			finalString += front;
			n -= 1;
		}
		return finalString;
	}

	//Took me 5 minutes
	public String stringBits(String str) {
		int x = str.length() / 2;
		int y = 0;
		int z = str.length();
		String finalString = "";
		while (x > 0) {
			finalString += str.substring(y,y+1);
			y += 2;
			x -= 1;
		}
	if (str.length() % 2 == 1) {
		return finalString + str.substring(z-1);
	}  
	return finalString;
	}

    //Took me 5 minutes
	public String stringYak(String str) {
		while (str.contains("yak")) {
		str = str.replace("yak","");
		return str;
	}
	return str;    
	}

	//Took me 10 minutes
	public int stringMatch(String a, String b) {
		int x = 0;
		int z = 0;
		String small = "";
		String big = "";

		if (a.length() > b.length() || a.length() == b.length()) {
			small = b;
			big = a; 
		} else {
			small = a;
			big = b;
		}
		while (x < (small.length() - 1)) { 
			String sub1 = small.substring(x,x+2);
			String sub2 = big.substring(x,x+2);
				if (sub1.equals(sub2)) {
				z += 1;
				x += 1;
			}
		x += 1;
		} 
		return z;
	}
       
      
     
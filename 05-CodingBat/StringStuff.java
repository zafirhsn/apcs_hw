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
	    return 21-n; 
	}

	public boolean nearHundred(int n) {
	    return Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10;
	}

        public int teaParty(int tea, int candy) {
	    if (tea < 5 || candy < 5) {
		return 0;
	    }
	    if (tea >= 2 * candy || candy >= 2 * tea) {
		return 2;
	    }
	    return 1;
	}

    
        public boolean lastDigit(int a, int b, int c) {
	    return (a % 10 == c % 10 || a % 10 == b % 10 || c % 10 == b % 10);
 	    }

        public boolean mixStart(String str) {
	    if (str.contains("ix")) {
	         return true;
	    } else {
		 return false;
	    }
	}

}

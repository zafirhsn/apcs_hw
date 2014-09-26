public class Driver {
	
	public String mixStart(String str) {
	    if (str.contains("ix")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String makeOutWord(String out, String word) {
		return out.substring(0,2) + word + out.substring(2);
	}	
	
	public String firstHalf(String str) {
		return str.substring(0,(str.length()/2));
	}
}

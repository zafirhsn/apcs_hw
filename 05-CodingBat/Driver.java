public class Driver { 
	public static void main (String[] args) {
		StringStuff Test = new StringStuff();
		
		System.out.println(Test.nonStart("Hello","There"));
		System.out.println(Test.makeAbba("Hello","There"));
		System.out.println(Test.diff21(45));
		System.out.println(Test.nearHundred(95));
		System.out.println(Test.teaParty(4,6));
		System.out.println(Test.lastDigit(5,7,12));
	}
}

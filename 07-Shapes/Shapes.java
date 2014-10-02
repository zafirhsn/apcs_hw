
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
	
	//Took about 10 minutes
	public String tri1(int h) {
		String ans = "";
		String cc = "";
		while (h > 0) {
			cc += "*";
			ans += cc + "\n";
			h -= 1;
		}
		return ans;
	}
	
	//Took about 25 minutes
	public String tri2(int h) {
		String ans = "";
		String cc = "";
		int x = 1;
		int z = 1;
		int y = 1;
		while (h > 0) {
			while (x < h) {
				cc += " ";
				x += 1;
			}
			while (y > 0) {
				cc += "*";
				y -= 1;
			}
			ans += cc + "\n";
			h -= 1;
			x = 1;
			z += 1;
			y = z;
			cc = "";
		}
		return ans;
	}
}
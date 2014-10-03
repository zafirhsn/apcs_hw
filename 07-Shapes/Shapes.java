
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
	
	
	//Took about 20 minutes
	public String tri3 (int h) {
		int space = h-1;
		int star = 1;
		int z = 1;
		int x = 1;
		int row = h;
		String finalString = "";
		String cc = "";
		while (row > 0) {
			while (space > 0) {
				cc += " ";
				space -= 1;
			}
			z++;
			space = h - z;
			while (star > 0) {
				cc += "*";
				star -= 1;
			}
			x += 2;
			star = x;
			finalString += cc + "\n";
			cc = "";
			row -= 1;
		}
		return finalString;
	}
	
	//Could not get this
	public String diamond(int h) {
		Shapes test1 = new Shapes();
		
		String ans = test1.tri3(h);
		String cc = "";
		
		int y = h;
		int z = h;
		int x = 1;
		int w = x;
	while (h > 0) {	
		while (z > 0) {
			cc += "*";
			z -= 1;
		}
		ans += cc + "\n";
		y -= 2;
		z = y;
		
		
		while (x > 0) {
			cc += " ";
			x -= 1;
		}
		w += 1;
		x = w;
		while (z > 0) {
			cc += "*";
			z -= 1;
		}
		y -= 2;
		z = y;
		ans += cc + "\n";
		h -= 1;
		
	}
	return ans;
	
	
}
		
		
		
		
		
		
	
	
	
	
	
}
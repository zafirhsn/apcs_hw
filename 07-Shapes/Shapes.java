
public class Shapes {
    public String box(int r, int c) {
	String s = "";
	while (r > 0){
	    int counter = 0;
	    while (counter < c){
		s += "*";
		counter += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
	
    //Took about 10 minutes
    public String tri1(int h) {
	String s = "";
	String cc = "";
	while (h > 0) {
	    cc += "*";
	    s += cc + "\n";
	    h -= 1;
	}
	return s;
    }
	
    //Took about 25 minutes
    public String tri2(int h) {
        String s = "";
	int space = h-1;
	int star = 1;
	int r = h;
	while (r > 0) {
	    while (space > 0) { 
		s += " ";
		space -= 1;
	    }
	    while (star > 0) {
		s += "*";
		star -= 1;
	    }
	    r -= 1;
	    space = r-1;
	    star = h-space;
	    s += "\n";
	}
	return s;

    }
	
	
    //Took about 20 minutes
    public String tri3 (int h) {
	String s = ""; 
	int r = h;
	int space = r-1;
	int star = 2*h-space-r; 
	while (r > 0) {
	    while (space > 0) {
		s += " ";
		space -= 1;
	    }
	    while (star > 0) {
		s += "*";
		star -= 1;
	    }
	    r -= 1;
	    space = r-1;
	    star = 2*h-space-r;
	    s += "\n";
	}
	return s;

    }
	
    //15 minutes
    public String diamond(int h) {
	String s = tri3((h/2)+1);
	int r = h-2;
	int space = h-r-((h-r)/2);
	int star = r;
	while (r > 0) {
	    while (space > 0) {
		s += " ";
		space -= 1;
	    }
	    while (star > 0) {
		s += "*";
		star -= 1;
	    }
	    r -= 2;
	    space = h-r-((h-r)/2);
	    star = r;
	    s += "\n";
	}
	return s;	
    }


    //10y minutes
    public String tri4(int h) {
	String s = "";
	int r;
	int space;
	int star;
	for (r=h;r>0;r-=1) {
	    for (space=h-r;space>0;space-=1) {
		s += " ";
	    }
	    for (star=r;star>0;star-=1) {
		s += "*";
	    }
	    s += "\n";
	}
	return s;
    }
}

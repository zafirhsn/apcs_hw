public class Frame {

    //10 minutes
    public String frame(int r,int c) {
	String line = "";
	String s = "";
	int x;
	int y;
	int space;
	int star;
	for (star=c;star>0;star-=1){
	    s += "*";
	}
	line = s;
	
	for (x=r-2;x>0;x-=1){ 
	    s += "\n" + "*";
	    for (y=c-2;y>0;y-=1){
		s += " ";
	    }
	    s += "*";
	}
	s += "\n" + line;
	return s;
    }

    // 5 minutes
    public String stringSplosion(String str) {
	String s = "";
	int i; 
	for (i=0;i<=str.length();i+=1){
	    s += str.substring(0,i);
	}
	return s;
    }

    //5 minutes
    public String stringX(String str) {
	String s = str.substring(1,(str.length()-1));
	if (str.length() < 3) {
	    return str;
	}
	s = s.replaceAll("x","");
	return str.substring(0,1) + s + str.substring(str.length()-1);
    
    }
	    
}

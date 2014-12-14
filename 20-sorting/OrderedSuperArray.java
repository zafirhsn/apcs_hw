public class OrderedSuperArray extends Sarray {
    public OrderedSuperArray() {
        super();
    } 

    public boolean add(String s) {
	String[] ndata = new String[data.length+1];
	int c = 0;
	for (int i=0;i<data.length;i++) {
	    if (s.compareTo(data[i]) < 0) {
		ndata[i] = s;
	    }
	    else {
		ndata[i] = data[i-c];
	    }	
	}
	return true;
    }

    public String set(int index, String s) {
	data[index] = s;
	add(s);
	return s;
    }
	
	
    
    public static void main(String[] args) {
	OrderedSuperArray w = new OrderedSuperArray();
	
	System.out.println(w.add("if"));
    }
}

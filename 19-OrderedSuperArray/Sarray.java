public class Sarray {
    private String[] data;
    private int last;

    public Sarray() {
	data = new String[] {"hello","sup","what","yay","woophee"};
	last = data.length-1;
	// set up the initial instance variables
    }

    
    // adds an item to the end of the list, grow if needed
    // returns true
    public boolean add(String i){
        String[] ndata = new String[data.length+1];
	for (int h=0;h<data.length;h++){
	    ndata[h] = data[h];
	}
	ndata[data.length] = i;
	data = ndata;
	return true;
    }

   
    // adds item i  at index, shifting everything down as needed.
    // also grows as needed
    public boolean add(int index, String i){
        String[] ndata = new String[data.length+1];
	int c = 0;
	for (int h=0;h<ndata.length;h++){	  
	    if (h == index) {
		ndata[h] = i;
		c = 1;
	    }
	    else {
		ndata[h] = data[h-c];
	    }
	}
	data = ndata;
	return true;
    }
   
   
 // returns the number of items in the list (not the array size)   
    public int size() {
        int count = 0;
	for(int i=0;i<data.length;i++){
	    if (!data[i].equals(null)) {
		count++;
	    }
	}
	return count;
    }

    
// returns the item at location index of the lsit
    public String get(int index) {
	return (data[index]);
    }


// sets the item at location index to value i
// returns the old value.
    public String set(int index, String i){
        String n = data[index];
	data[index] = i;
	return n;
    }


// removes the item at index i
// returns the old value
    public String remove(int index){
	String n = data[index];
	data[index] = null;
	return n;
    }


    public void isort() {
	String newvalue;
	int z;
	for (int i=0;i<data.length;i++){
	    newvalue = data[i];
	    for (z=i;z>0 && newvalue.compareTo(data[z]) <0; z--){
		data[z] = data[z-1];
	    }
	    data[i] = newvalue;
	}
    }

    public void ssort() {
	String low = "";
	for (int i=0;i<data.length;i++){
	    for (int h=i; h<data.length;h++){
		if (data[h].compareTo(low) < 0) {
		    low = data[h];
		}
	    }
	    data[i+1] = data[i];
	    data[i] = low;
	    System.out.println(data[i]);
	}
    }


 
//---------------MAIN------------
    public static void main(String[] args) {
	Sarray test = new Sarray();
	
	System.out.println(test.add("TESTING"));
	System.out.println(test.add(3,"IF"));
	System.out.println(test.size());
        System.out.println(test.get(3));
	System.out.println(test.set(3,"WHAMMY"));
	System.out.println(test.remove(3));
	test.ssort();
	
    }
}

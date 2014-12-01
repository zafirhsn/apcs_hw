public class Sarray {
    String[] data;
    int last;

    public Sarray() {
	data = new String[] {"hello","sup","what","yay","woophee"};
	last = 0;
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
 
//---------------MAIN------------
    public static void main(String[] args) {
	Sarray test = new Sarray();
	
	System.out.println(test.add("TESTING"));
	System.out.println(test.add(3,"IF"));
	System.out.println(test.size());
    }
}

public class Sarray {
    int[] data;
    int last;

    public Sarray() {
	data = new int[] {1,2,3,6,8,10};
	last = 0;
	// set up the initial instance variables
    }

    
    // adds an item to the end of the list, grow if needed
    // returns true
    public boolean add(int i){
        int[] ndata = new int[data.length+1];
	for (int h=0;h<data.length;h++){
	    ndata[h] = data[h];
	}
	ndata[data.length] = i;
	return true;
    }

   
    // adds item i  at index, shifting everything down as needed.
    // also grows as needed
    public boolean add(int index, int i){
        int[] ndata = new int[data.length+1];
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
	    if (data[i] != 0) {
		count++;
	    }
	}
	return count;
    }

    
// returns the item at location index of the lsit
    public int get(int index) {
	return (data[index]);
    }


// sets the item at location index to value i
// returns the old value.
    public int set(int index, int i){
        int n = data[index];
	data[index] = i;
	return n;
    }


// removes the item at index i
// returns the old value
    public int remove(int index){
	int n = data[index];
	data[index] = 0;
	return n;
    }
 
//---------------MAIN------------
    public static void main(String[] args) {
	Sarray test = new Sarray();
	
	System.out.println(test.add(17));
	System.out.println(test.add(3,90));
	System.out.println(test.size());
    }
}

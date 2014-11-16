import java.util.io.*;

public class rndArray {
    ArrayList<Integer> al = new ArrayList<Integer>(); 
    
    public static ArrayList<Integer> rndArrayList(ArrayList<Integer> a) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	
	for(int i=0;i<a.size();i++){
	    int rndIndex = r.nextInt(a.size());
	    
	    while(b.get(rndIndex) == null){
		rndIndex = r.nextInt(a.size());
	    }
	    b.add(rndIndex, a.get(i));	    
	}
    }
    
    public static void main(String[] args) {
	ArrayList<Integer> test = new ArrayList<Integer>();
	test.add(1);
	test.add(2);
	test.add(3);
	test.add(4);
	test.add(5);
	System.out.println(rndArrayList(test));
    }
}
    


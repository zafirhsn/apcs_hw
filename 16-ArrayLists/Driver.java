import java.util.*;

public class Driver {
    public static ArrayList<Integer> rmDuplicate(ArrayList<Integer> intList) {
	for(int i=0;i<intList.size()-1;i++){
	    while(intList.get(i) == intList.get(i+1)){
		intList.remove(i+1);
	    }
	}
	return intList;	
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

	Random r = new Random();
	for(int i =0;i<20;i++){
	    al.add(r.nextInt(5));
	}
	System.out.println(al);
	System.out.println(rmDuplicate(al));
    }
}

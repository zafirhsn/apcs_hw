import java.util.*;

public class Searching {
    private Comparable[] a;
    
    public Searching() {
	a = new Comparable[100000000];
    }

    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++) {
	    s += a[i] + ", ";
	}
	return s;
    }

    public boolean addItem() {
	Random r = new Random();
        for (int i=0;i<a.length;i++) {
	    a[i] = r.nextInt(100000000);
	}
        return true;
    }
    
    public void sort() {
	Arrays.sort(a);
    }

    public Comparable Isearch(Comparable item) {
	for (int i=0;i<a.length;i++) {
	    if (a[i] == item) {
		return a[i];
	    }
	}
	return null;
    }

    public Comparable Bsearch(Comparable item) {
	sort();
        int low = 0;
        int high = a.length-1;
	int midIndex = (low+high)/2;
	while (a[midIndex] != item) {
	    midIndex = (low + high)/2;
	    if (a[midIndex].compareTo(item) < 0) {
		low = midIndex;
	    }
	    if (a[midIndex].compareTo(item) > 0) {
		high = midIndex;
	    }
	}
	return a[midIndex];
    }
       
	

    public static void main(String[] args) {
	Searching test = new Searching();
	test.addItem();

	long startTime = System.nanoTime();
	System.out.println(test.Isearch(7));
	long endTime = System.nanoTime();

	long duration = (endTime - startTime);
	System.out.println(duration/1000000);

    }
}

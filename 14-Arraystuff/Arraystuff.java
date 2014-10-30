import java.util.*;

public class Arraystuff {
    private int[] a;
    Random rnd;

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
	}

//------------HW 14--------------
    public int find(int n) {
	for(int i=0;i<a.length;i++){
	    if (n == a[i]){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal() {
	int x = 0;
	for(int i=0;i<a.length;i++){
	    if (a[i] > x) {
		x = a[i];
	    }
	}
	return x;
    }

//-------------HW 14B-------------
    public int freq(int i) {
	int x = a[i];
	int count = 0;
	for(int z=0;z<a.length;z++){
	    if (x == a[z]) {
		count++;
	    }
	}
	return count;
    }

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);

	System.out.println(as.find(78));
	System.out.println(as.maxVal());

	System.out.println(as.freq(0));
	
    }
}

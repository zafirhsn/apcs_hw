public class OrderedSuperArray extends Sarray {
    public boolean add(String s) {
	int[] ndata = new int[data.length];
   	for (int i=0;i<data.length;i++){
	    ndata[i] = s.compareTo(data[i]);
	}
	int n = 0;
	for (int h=0;h<data.length;h++) {
	    if (ndata[h] < n) {
		n = ndata[h];
	    }
	}
	

    
    public static void main(String[] args) {
	String a = "Abacus";
	String b = "aeautiful";
	System.out.println(a.compareTo(b));
    }
}

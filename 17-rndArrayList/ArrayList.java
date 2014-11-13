public class ArrayList {
	public static ArrayList<Integer> rndArrayList(ArrayList<Integer> a) {
	    ArrayList<Integer> b = new ArrayList<Integer>();

	    Random r = new Random();
	    for(int i=1;i<a.size();i++){
		int n = r.nextInt(a.size());
		if (b.get(n).equalsTo(null)){
		    b.add(n,i);
		}
		else {
		    int n = r.nextInt(a.size());
		}
	    }
	    return b;
	}

        public static void main (String [] args){
	    ArrayList<Integer> a1= new ArrayList<Integer>;
	    for (i=1; i<6; i++){
		
	    }
	    System.out.println(rndArrayList(a1));
	}
}
    

    


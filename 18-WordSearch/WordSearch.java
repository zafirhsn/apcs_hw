public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void checkBound(String w, int row, int col, boolean backward){
	if (row < 0 || row > board.length){
	    System.out.println ("Row number invalid");
	    System.exit(0);
	}
	if (col < 0 || col > board[row].length){
	    System.out.println("Column number invalid");
	    System.exit(0);
	}
	if (w.length() + col >= board[row].length) {
	    System.out.println("The word does not fit horizontally");
	    System.exit(0);
	}
    }

    public void addWordH(String w, int row, int col, boolean backward){
	checkBound(w,row,col,backward);
	if (backward == true) {
	    int c = col;
	    for (int i=w.length()-1;i >= 0;i--){
		board[row][c] = w.charAt(i);
		c ++;
	    }
	}else {
	    int c = col;
	    for (int i=0; i < w.length();i++){
		board[row][c] = w.charAt(i);
		c++;
	    }
	}
    }
       	
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	//Should work
	w.addWordH("HELLO",3,0,false);
	w.addWordH("HELLO",3,18,true);	
	w.addWordH("HELLO",12,23,false);
	w.addWordH("HELLO",14,10,true);

        //Row is to high, return "not valid"
	w.addWordH("HELLO",25,3,false);

	//Row is too low, return "not valid"
	w.addWordH("HELLO",-5,3,false);	
	
	//Col is too high, return "not valid"
	w.addWordH("HELLO",3,45,false);
	//Col is too low, return "not valid"
	w.addWordH("HELLO",3,-10,false);
	//Word does not partially fit, return "not valid"
	w.addWordH("HELLO",3,38,false);

	System.out.println(w);
    }
}

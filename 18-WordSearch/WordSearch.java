import java.util.*;

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

    public void checkBound(String w, int row, int col, int direction){
	if (row < 0 || row > board.length){
	    System.out.println ("Row number invalid");
	    System.exit(0);
	}
	if (col < 0 || col > board[row].length){
	    System.out.println("Column number invalid");
	    System.exit(0);
	}
	if (direction == 0) {
	    if (w.length() + col >= board[row].length) {
		System.out.println("The word does not fit horizontally");
		System.exit(0);
	    }
	}
	if (direction == 1){
	    if (w.length() + row >= board.length){
		System.out.println("The word does not fit vertically");
		System.exit(0);
	    }
	}
	if (direction == 2) {
	    if (w.length() + col >= board[row].length || w.length() + row >= board.length) {
		System.out.println("The word does not fit diagnoly");
		System.exit(0);
	    }
	}
    }

    public void Overlap(String w, int row, int col,int i){
	if (w.charAt(i) != board[row][col] && board[row][col] != '.') {
	    System.out.println("Illegal overlap");
	    System.exit(0);
	}
    }

    public void addWordH(String w, int row, int col, boolean backward){
	checkBound(w,row,col,0);
	if (backward == true) {
	    int c = col;
	    for (int i=w.length()-1;i >= 0;i--){
		Overlap(w,row,c,i);
		board[row][c] = w.charAt(i);
		c ++;
		}
	}
	else {
	    int c = col;
	    for (int i=0; i < w.length();i++){
		Overlap(w,row,c,i);
		board[row][c] = w.charAt(i);
		c++;
	    }
	}
    }

    public void addWordV(String w, int row, int col, boolean backward){
	checkBound(w,row,col,1);
	if (backward == true) {
	    int r = row;
	    for (int i=w.length()-1;i>=0;i--){
		Overlap(w,r,col,i);
		board[r][col] = w.charAt(i);
		r++;
	    }
	}
	else {
	    int r = row;
	    for (int i=0; i < w.length();i++){
		Overlap(w,r,col,i);
		board[r][col] = w.charAt(i);
		r++;
	    }
	}
    }

    public void addWordD(String w, int row, int col, boolean backward){
	checkBound(w,row,col,2);
	if (backward == true){
	    int r = row;
	    int c = col;
	    for (int i=w.length()-1;i>=0;i--){
		Overlap(w,r,c,i);
		board[r][c] = w.charAt(i);
		c++;
		r++;
	    }
	}else {
	    int r = row;
	    int c = col;
	    for (int i=0;i<w.length();i++){
		Overlap(w,r,c,i);
		board[r][c] = w.charAt(i);
		c++;
		r++;
	    }
	}
    }
    
    public boolean addWord(String w){
	Random r = new Random();
	int Rorient = r.nextInt(3);
	int Rrow = r.nextInt(board.length);
	int Rcol = r.nextInt(board[0].length);
	if (Rorient == 0){
	    addWordH(w,Rrow,Rcol,true);
	}
	if (Rorient == 1){
	    addWordV(w,Rrow,Rcol,true);
	} else {
	    addWordD(w,Rrow,Rcol,true);
	}
	return true;
    } 


    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	//Should work
	/*
	w.addWordH("HELLO",3,0,false);
	w.addWordH("HELLO",3,18,true);	
	w.addWordH("HELLO",12,23,false);
	w.addWordH("HELLO",14,10,true);
	w.addWordV("HELLO",2,21,false);
	w.addWordV("HELLO",8,20,true);
	w.addWordD("HELLO",9,2,true);
	*/
	w.addWord("HELLO");
	w.addWord("HELLO");	
	w.addWord("HELLO");
	w.addWord("HELLO");
	w.addWord("HELLO");
	w.addWord("HELLO");	
	/*
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

	//w.addWordV("WHAT",7,18,true);
        */

	System.out.println(w);
    }
}

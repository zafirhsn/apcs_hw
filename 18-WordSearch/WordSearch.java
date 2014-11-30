import java.util.*;
import java.io.*;

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
 
    public static ArrayList<String> ReadFile() {
	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e){
	    System.out.println("Can't open word file");
	    System.exit(0);
	}
	ArrayList<String> wordlist = new ArrayList<String>();
	while (sc.hasNext()){
	    wordlist.add(sc.next());
	}
	return wordlist;
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

    public boolean checkBound(String w, int row, int col, int direction){
	if (row < 0 || row > board.length){
	    return false;
	}
	if (col < 0 || col > board[row].length){
	    return false;
	}
	if (direction == 0) {
	    if (w.length() + col >= board[row].length) {
		return false;
	    }
	    for (int i=0;i<w.length();i++){
		if (w.charAt(i) != board[row][col+i] && board[row][col+i] != '.') {
		    return false;
		}
	    }	
	}
	if (direction == 1){
	    if (w.length() + row >= board.length){
		return false; 
	    }
	    for (int i=0;i<w.length();i++){
		if (w.charAt(i) != board[row+i][col] && board[row+i][col] != '.') {
		    return false;
		}
	    }
	}
	if (direction == 2) {
	    if (w.length() + col >= board[row].length || w.length() + row >= board.length) {
		return false; 
	    }
	    for (int i=0;i<w.length();i++){
		if (w.charAt(i) != board[row+i][col+i] && board[row+i][col+i] != '.') {
		    return false;
		}
	    }
	}
	return true;
    }

    public boolean addWordH(String w, int row, int col, boolean backward){
	if (checkBound(w,row,col,0) == false) {
	    return false;
	}
	if (backward == true) {
	    int c = col;
	    for (int i=w.length()-1;i >= 0;i--){
		board[row][c] = w.charAt(i);
		c++;

	    }
	    return true;
	}
	else {
	    int c = col;
	    for (int i=0; i < w.length();i++){
		board[row][c] = w.charAt(i);
		c++;     
	    }
	    return true;
	}
    }

    public boolean addWordV(String w, int row, int col, boolean backward){
	if (checkBound(w,row,col,1) == false) {
	    return false;
	}
	if (backward == true) {
	    int r = row;
	    for (int i=w.length()-1;i>=0;i--){
		board[r][col] = w.charAt(i);
		r++;
		
	    }
	    return true;
	}
	else {
	    int r = row;
	    for (int i=0; i < w.length();i++){
		board[r][col] = w.charAt(i);
		r++;
		
	    }
	    return true;
	}
    }

    public boolean addWordD(String w, int row, int col, boolean backward){
	if (checkBound(w,row,col,2) == false) {
	    return false;
	}
	if (backward == true){
	    int r = row;
	    int c = col;
	    for (int i=w.length()-1;i>=0;i--){
		board[r][c] = w.charAt(i);
		c++;
		r++;
	       
	    }
	    return true;
	}
	else {
	    int r = row;
	    int c = col;
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
		r++;
		
	    }
	    return true;
	}
    }
    
    public boolean addWord(String w){
	Random r = new Random();
	int Rorient = r.nextInt(3);
	int Rrow = r.nextInt(board.length);
	int Rcol = r.nextInt(board[0].length);
	if (Rorient == 0){
	    while (addWordH(w,Rrow,Rcol,true) == false) {
		Random f = new Random();
		Rrow = f.nextInt(board.length);
		Rcol = f.nextInt(board[0].length);		
	    }
	}
	if (Rorient == 1){
	    while (addWordV(w,Rrow,Rcol,true) == false) {
		Random f = new Random();
		Rrow = f.nextInt(board.length);
		Rcol = f.nextInt(board[0].length);		
	    }
	}		
	else {
	    while (addWordD(w,Rrow,Rcol,true) == false) {
		Random f = new Random();
		Rrow = f.nextInt(board.length);
		Rcol = f.nextInt(board[0].length);	
	    }
	}
	return true;
    }

    public void buildPuzzle(int numWords) {
	Random r = new Random();
	int length = ReadFile().size();
	while (numWords > 0) {
	    String s = ReadFile().get(r.nextInt(length));
	    System.out.println(s);
	    addWord(s);
	    
	    numWords --;
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	w.buildPuzzle(10);

	System.out.println(w);
    }
}

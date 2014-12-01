import java.util.*;
import java.io.*;

public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]= '.';
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

    public String difficulty() {
	ArrayList<String> Diff = new ArrayList<String>();
	Diff.add("Easy");
	Diff.add("Medium");
	Diff.add("Hard");
	System.out.println("These are your difficulty options. Choose one.");
	System.out.println(Diff);
	String input = "";
	Scanner a = new Scanner(System.in);
        input = a.nextLine();

	while (!input.equals(Diff.get(0)) && !input.equals(Diff.get(1)) && !input.equals(Diff.get(2))) {
	    System.out.println("That is not a valid difficulty setting");
	    System.out.println("Choose from these options:");
	    System.out.println(Diff);
	    Scanner b = new Scanner(System.in);
	    input = a.nextLine();
	}
	return input;
    }

    public void buildPuzzle() {
	String letters = "";
	String input = difficulty();
	
	if (input.equals("Easy")) {
	    letters = "ioqqrstuuvwxxyzz";
	    int numWords = 5;
	    Random r = new Random();  
	    int length = ReadFile().size();
	    while (numWords > 0) {
		String s = ReadFile().get(r.nextInt(length));
		System.out.println(s + "\n");
		addWord(s);
		numWords --;
	    }
	}
	
	if (input.equals("Medium")) {
	    letters = "ehijknopqrtuvwxyz";
	    int numWords = 8;
	    Random r = new Random();  
	    int length = ReadFile().size();
	    while (numWords > 0) {
		String s = ReadFile().get(r.nextInt(length));
		System.out.println(s + "\n");
		addWord(s);
		numWords --;
	    }
	}
	
	if (input.equals("Hard")) {
	    letters = "abcdefghijklmnopqrstuvwxyz";
	    int numWords = 15;
	    Random r = new Random();  
	    int length = ReadFile().size();
	    while (numWords > 0) {
		String s = ReadFile().get(r.nextInt(length));
		System.out.println(s + "\n");
		addWord(s);
		numWords --;
	    }
	}
	Random rnd = new Random();
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if (board[i][j]=='.'){										
		    board[i][j] = letters.charAt(rnd.nextInt(letters.length()));
		}
	    }
	}
    }
    
    

    public static void main(String[] args) {
	ArrayList<String> boardSize = new ArrayList<String>();
	boardSize.add("Small");
	boardSize.add("Medium");
	boardSize.add("Large");
	boardSize.add("Huge");
		      
	System.out.println("These are your board size options. Choose one.");
	System.out.println(boardSize);
	String input = "";
	Scanner a = new Scanner(System.in);
        input = a.nextLine();

	while (!input.equals("Small") && !input.equals("Medium") && !input.equals("Large") && !input.equals("Huge")){
	    System.out.println("That is not a valid choice. Choose from these options:");
	    System.out.println(boardSize);
	    input = "";
	    Scanner b = new Scanner(System.in);
	    input = a.nextLine();
	}
	if (input.equals("Small")) {
	    WordSearch w = new WordSearch(15,35);
	    w.buildPuzzle();
	    System.out.println(w);
	}
	if (input.equals("Medium")) {
	    WordSearch w = new WordSearch();
	    w.buildPuzzle();
	    System.out.println(w);
	}	
	if (input.equals("Large")) {
	    WordSearch w = new WordSearch(30,50);
	    w.buildPuzzle();
	    System.out.println(w);
	} if (input.equals("Huge")) {
	    WordSearch w = new WordSearch(40,60);
	    w.buildPuzzle();
	    System.out.println(w);
	}
    }
}

package td2;

public class StringBuffer {
	
	private char[] lesCaracteres;  // Table to stock characters
    private int n;  // Number of characters presented in the table
	
	
	// Converts a boolean b to its string representation.
	public static String valueOf(boolean b) {
	    return b ? "true" : "false";
	}
	
	//Converts a character c to its string representation.
	public static String valueOf(char c) {
	    return Character.toString(c);
	}
	
	//Converts an integer i to its string representation.
	public static String valueOf(int i) {
	    return Integer.toString(i);
	}
	
	// Question 2.1:
	
	public StringBuffer(int l) {
	    lesCaracteres = new char[l];
	    n = 0;
	}
	
	public StringBuffer() {
	    this(16);  // Calls the above constructor with default length 16
	}
	
	// To initialize the buffer with the content of the string str and a buffer size of str.length() + 16.
	public StringBuffer(String str) {
	    lesCaracteres = new char[str.length() + 16];
	    n = str.length();
	    System.arraycopy(str.toCharArray(), 0, lesCaracteres, 0, n);  // Copies the string characters into the buffer
	}
	
	
	
	public static void main(String[] args) {
		
		// example 1: 
		System.out.println(valueOf(true));
		
		// example 2:
		int a = 10;
        int b = 20;
        
        String result = String.valueOf(a > b);
        System.out.println("a est-il supérieur à b ? " + result);
        
	}

}

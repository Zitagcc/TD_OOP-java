package td3;

public class ListeNonVide extends Liste {
	private Terme tete;
	private Terme queue;
	
	public ListeNonVide(Terme tete, Liste queue){
		this.tete = tete;
		this.queue = queue;
	}
	
	public ListeNonVide(Terme tete, Variable queue){
		this.tete = tete;
		this.queue = queue;
	}
	
    // Version 1 : The toString method returns the string "[" + the head of the list
	// converted to a string + "|" + the tail of the list converted to a
	// string + "]" Example: [1|[2|[3|[]]]]
    @Override
	public String toString() {
		return "[" + tete.toString() + "|" + queue.toString() + "]";
    }

    // Version 2 : toString() with elements separated by commas
    public String toStringSimple() {
    	        return tete.toString() + ", " + queue.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListeNonVide) {
            ListeNonVide autreListe = (ListeNonVide) obj;
            return tete.equals(autreListe.tete) && queue.equals(autreListe.queue);
        }
        return false;
    }
    
	public static void main(String[] args) {
		System.out.println("Test ListeNonVide");
		Variable x = new Variable("X");
		Variable y = new Variable("Y");
		Liste l1 = new ListeVide();
		Liste l2 = new ListeNonVide(x, l1);
		
	}
}

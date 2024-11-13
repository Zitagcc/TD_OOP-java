package td4;

public class Main {
    public static void main(String[] args) {
    	
    	FileAttentePr fileAttentePr = new FileAttentePr();
        // Test avec FileAttentePrH
    	FileAttentePrH fileAttentePrH = new FileAttentePrH();
        
        fileAttentePrH.enfiler(new Element(6));
        fileAttentePrH.enfiler(new Element(3));
        fileAttentePrH.enfiler(new Element(5));
        fileAttentePrH.enfiler(new Element(2));
        fileAttentePrH.enfiler(new Element(1));
        fileAttentePrH.enfiler(new Element(4));
        
        System.out.println(fileAttentePrH);
        
        while (!fileAttentePrH.estVide()) {
        	System.out.println("Défilé : " + fileAttentePrH.defiler());
            System.out.println(fileAttentePrH);
            System.out.println("------");
        }
    }
}

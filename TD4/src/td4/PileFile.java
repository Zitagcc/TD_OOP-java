package td4;

import java.util.AbstractList;
import java.util.ArrayList;

public abstract class PileFile<E> {
	AbstractList<E> rep;

	public PileFile() {
		this.rep = new ArrayList<E>();
	}
	
    protected boolean estVide() {
        return rep.isEmpty();
    }
    
    // La méthode toString retourne une chaîne de caractères représentant le contenu
    // de la pile : la liste des objets de la pile-file entre [] et séparés par des virgules.
    // utilise une méthode récursive pour le faire (pas de boucle).
    
    public String toString() {
    	String s = "[";
		if (rep.size() > 0) {
			s += rep.toString();
		}
		else {
			s += "]";
		}
		
		return s;
    	
    }
    
}
	


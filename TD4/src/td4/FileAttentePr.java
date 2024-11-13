package td4;

/*Une file d’attente avec priorité est une file d’attente dans laquelle l’ordre suivant lequel les
objets sont sortis dépend de leur priorité : defiler sort l’objet le plus prioritaire de la file
d’attente. Les objets stockés dans une file d’attente
avec priorité sont des objets qui possèdent une
priorité : ils doivent implémenter l’interface
Priorisable.*/

// FileAttentePr, une file d'attente avec priorité où les éléments sont extraits en fonction de leur priorité.
// FileAttentePr est une file de priorité simple où on peut ajouter des éléments et extraire celui de plus haute priorité.


import java.util.Queue;


import java.util.ArrayList;

public class FileAttentePr {
    private ArrayList<Priorisable> elements;

    public FileAttentePr() {
        elements = new ArrayList<>();
    }

    // Ajouter un élément à la file
    public void enfiler(Priorisable element) {
        elements.add(element);
    }

    // Retirer et retourner l'élément de plus haute priorité
    public Priorisable defiler() {
        if (elements.isEmpty()) {
            return null;
        }

        int indexMax = 0;
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).getPriorite() > elements.get(indexMax).getPriorite()) {
                indexMax = i;
            }
        }

        return elements.remove(indexMax);
    }

    public boolean estVide() {
        return elements.isEmpty();
    }
    
    


}
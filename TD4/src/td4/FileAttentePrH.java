package td4;

// FileAttentePrH, une file d'attente avec priorité gérée par un tas (heap) 
// pour une extraction efficace des éléments de plus haute priorité.


import java.util.ArrayList;

public class FileAttentePrH {
    private ArrayList<Priorisable> heap;

    public FileAttentePrH() {
        heap = new ArrayList<>();
    }

    // Ajouter un élément et le remonter à sa place dans le tas
    public void enfiler(Priorisable element) {
        heap.add(element);
        remonter(heap.size() - 1);
    }

    // Retirer et retourner l'élément de plus haute priorité
    public Priorisable defiler() {
        if (heap.isEmpty()) {
            return null;
        }

        Priorisable maxElement = heap.get(0);
        Priorisable dernierElement = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, dernierElement);
            descendre(0);
        }

        return maxElement;
    }

    public boolean estVide() {
        return heap.isEmpty();
    }

    // Remonter l'élément ajouté à sa position correcte
    private void remonter(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; 
            if (heap.get(index).getPriorite() <= heap.get(parentIndex).getPriorite()) {
                break;
            }
            echanger(index, parentIndex);
            index = parentIndex;
        }
    }

    // Descendre l'élément à sa position correcte
    private void descendre(int index) {
        int taille = heap.size();
        while (true) {
            int gauche = 2 * index + 1;
            int droite = 2 * index + 2;
            int max = index;

            if (gauche < taille && heap.get(gauche).getPriorite() > heap.get(max).getPriorite()) {
                max = gauche;
            }
            if (droite < taille && heap.get(droite).getPriorite() > heap.get(max).getPriorite()) {
                max = droite;
            }
            if (max == index) {
                break;
            }
            echanger(index, max);
            index = max;
        }
    }

    // Méthode pour échanger deux éléments dans le tas
    private void echanger(int i, int j) {
        Priorisable temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
    // Méthode pour afficher le tas sous forme de chaîne de caractères et d'un arbre binaire
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Afficher le tas sous forme de tableau
        sb.append("Tas sous forme de tableau : ");
        for (Priorisable element : heap) {
            sb.append(element.getPriorite()).append(" ");
        }
        sb.append("\n");

        // Afficher le tas sous forme d'arbre binaire
        sb.append("Tas sous forme d'arbre binaire :\n");
        int niveau = 0;
        int elementsParNiveau = 1;
        int index = 0;

        while (index < heap.size()) {
            // Espacement pour aligner les éléments
            int espacement = (int) Math.pow(2, Math.max(0, niveau)) - 1;

            // Indentation initiale pour chaque niveau
            sb.append(" ".repeat(espacement * 2));

            for (int i = 0; i < elementsParNiveau && index < heap.size(); i++) {
                sb.append(heap.get(index).getPriorite()).append(" ");
                index++;
            }

            sb.append("\n");
            niveau++;
            elementsParNiveau *= 2;
        }

        return sb.toString();
    }
    
}


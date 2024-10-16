package td3;

public abstract class Terme {

    // Méthode toString abstraite que chaque sous-classe doit implémenter
    public abstract String toString();

    // Méthode equals abstraite que chaque sous-classe doit implémenter
    @Override
    public abstract boolean equals(Object obj);

    // Optionnel : Méthode utilitaire pour vérifier le type de l'objet passé à equals
    protected boolean sameClass(Object obj) {
        return obj != null && getClass() == obj.getClass();
    }
}


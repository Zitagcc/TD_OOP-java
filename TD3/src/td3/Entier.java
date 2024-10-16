package td3;

public class Entier extends TermeAtomique {
    private long valeur;

    public Entier(long valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return Long.toString(valeur);
    }


    @Override
    public boolean equals(Object obj) {
		if (obj instanceof Entier) {
			Entier autreEntier = (Entier) obj;
			return this.valeur == autreEntier.valeur;
		}
		else if (obj instanceof Variable) {
			Variable autreVariable = (Variable) obj;
			return autreVariable.equals(this);
		}
		return false;
    }
    

}


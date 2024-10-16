package td3;

public class TermeFonctionnel extends Terme {
    private String foncteur;
    private Liste parameters;

    
    public TermeFonctionnel(String foncteur, Liste parameters) {
        this.foncteur = foncteur;
        this.parameters = parameters;
    }

    
    @Override
    public String toString() {
        return foncteur + parameters.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        TermeFonctionnel that = (TermeFonctionnel) obj;

        if (!foncteur.equals(that.foncteur)) return false;
        return parameters.equals(that.parameters);
    }
}


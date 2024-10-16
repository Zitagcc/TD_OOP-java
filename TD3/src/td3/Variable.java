package td3;

public class Variable extends Terme {
	private String nom;
	private Terme valeur;
	
	public Variable(String nom){
		this.nom = nom;
		this.valeur = null;
	}
	
	public Variable(String nom, Terme valeur){
		this.nom = nom;
		this.valeur = valeur;
	}
	
	public Terme getValeur(){
		return this.valeur;	
	}
	
	// the method toString() returns a string consisting of the variable 
	// name followed by "=", followed by "?" if the variable has no value, or 
	// followed by the value of the variable converted to a string if the variable has a value.
	public String toString(){
		if (this.valeur == null) {
			return this.nom + "=?";
		}
		return this.nom + "=" + this.valeur.toString();
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Variable) {
			Variable autreVariable = (Variable) obj;
			return this.nom.equals(autreVariable.nom) && this.valeur.equals(autreVariable.valeur);
		}
		return false;
		
	}
}

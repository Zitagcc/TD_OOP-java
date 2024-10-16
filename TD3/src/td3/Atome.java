package td3;

public class Atome extends TermeAtomique {
	private String valeur;
	
	public Atome(String valeur){
		this.valeur = valeur;
		
	}
	public String toString(){
		return valeur;
		
	}
	public boolean equals(Object obj){
		// if this object is an Atome
		if (obj instanceof Atome) {
			Atome autreAtome = (Atome) obj;
			return this.valeur.equals(autreAtome.valeur);
		}
		// if this object is a Variable
		if (obj instanceof Variable) {
			Variable autreVariable = (Variable) obj;
			return autreVariable.equals(this);
		}
		
		// otherwise 
		return false;
		
	}
	
}

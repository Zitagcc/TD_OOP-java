package td2;

public abstract class Complexe {
	public abstract double getReel();
	public abstract double getImaginaire();
	public abstract double getMod();
	public abstract double getArg();
	public abstract Complexe plus(Complexe c);
	public abstract Complexe moins(Complexe c);
	public abstract Complexe multipliePar(Complexe c);
	public abstract Complexe divisePar(Complexe c);
	public abstract Complexe conjugue();
	public abstract Complexe puissance(double x);
	public abstract Complexe ln();
	public abstract String toString();
}

package td2;

public class ComplexeRI extends Complexe {
    private double reel, imaginaire;

    public ComplexeRI(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public ComplexeRI(Complexe c) {
        this.reel = c.getReel();
        this.imaginaire = c.getImaginaire();
    }

    @Override
    public double getReel() {
        return reel;
    }

    @Override
    public double getImaginaire() {
        return imaginaire;
    }

    @Override
    public double getMod() {
        return Math.sqrt(reel * reel + imaginaire * imaginaire);
    }

    @Override
    public double getArg() {
        return Math.atan2(imaginaire, reel);
    }

    @Override
    public Complexe plus(Complexe c) {
        return new ComplexeRI(this.reel + c.getReel(), this.imaginaire + c.getImaginaire());
    }

    @Override
    public Complexe moins(Complexe c) {
        return new ComplexeRI(this.reel - c.getReel(), this.imaginaire - c.getImaginaire());
    }

    @Override
    public Complexe multipliePar(Complexe c) {
        double newReel = this.reel * c.getReel() - this.imaginaire * c.getImaginaire();
        double newImaginaire = this.reel * c.getImaginaire() + this.imaginaire * c.getReel();
        return new ComplexeRI(newReel, newImaginaire);
    }

    @Override
    public Complexe divisePar(Complexe c) {
        double modSquared = c.getMod() * c.getMod();
        double newReel = (this.reel * c.getReel() + this.imaginaire * c.getImaginaire()) / modSquared;
        double newImaginaire = (this.imaginaire * c.getReel() - this.reel * c.getImaginaire()) / modSquared;
        return new ComplexeRI(newReel, newImaginaire);
    }

    @Override
    public Complexe conjugue() {
        return new ComplexeRI(reel, -imaginaire);
    }

    @Override
    public Complexe puissance(double x) {
        double mod = Math.pow(this.getMod(), x);
        double arg = this.getArg() * x;
        double newReel = mod * Math.cos(arg);
        double newImaginaire = mod * Math.sin(arg);
        return new ComplexeRI(newReel, newImaginaire);
    }

    @Override
    public Complexe ln() {
        double mod = Math.log(this.getMod());
        double arg = this.getArg();
        return new ComplexeRI(mod, arg);
    }

    @Override
    public String toString() {
        return reel + " + " + imaginaire + "i";
    }
    
	public static void main(String[] args) {
		Complexe c1 = new ComplexeRI(3, 4);
		Complexe c2 = new ComplexeRI(1, 2);

		//System.out.println(c1.plus(c2)); System.out.println(c1.moins(c2));
		//System.out.println(c1.multipliePar(c2));
		//System.out.println(c1.divisePar(c2)); System.out.println(c1.conjugue()); 
		System.out.println(c1.puissance(1.2));
		//System.out.println(c1.ln());
		
	}
}


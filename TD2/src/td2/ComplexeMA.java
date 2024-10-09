package td2;

public class ComplexeMA extends Complexe {
    private double argument, module;

    
    public ComplexeMA(double module, double argument) {
        this.module = module;
        this.argument = argument;
    }


    public ComplexeMA(Complexe c) {
        this.module = c.getMod();
        this.argument = c.getArg();
    }


    @Override
    public double getReel() {
        return module * Math.cos(argument); // r * cos(θ)
    }

    @Override
    public double getImaginaire() {
        return module * Math.sin(argument); // r * sin(θ)
    }


    @Override
    public double getMod() {
        return module;
    }


    @Override
    public double getArg() {
        return argument;
    }

 
    @Override
    public Complexe plus(Complexe c) {
        double reel = this.getReel() + c.getReel();
        double imaginaire = this.getImaginaire() + c.getImaginaire();
        double newMod = Math.sqrt(reel * reel + imaginaire * imaginaire);
        double newArg = Math.atan2(imaginaire, reel);
        return new ComplexeMA(newMod, newArg);
    }


    @Override
    public Complexe moins(Complexe c) {
        double reel = this.getReel() - c.getReel();
        double imaginaire = this.getImaginaire() - c.getImaginaire();
        double newMod = Math.sqrt(reel * reel + imaginaire * imaginaire);
        double newArg = Math.atan2(imaginaire, reel);
        return new ComplexeMA(newMod, newArg);
    }


    @Override
    public Complexe multipliePar(Complexe c) {
        double newMod = this.getMod() * c.getMod();
        double newArg = this.getArg() + c.getArg();
        return new ComplexeMA(newMod, newArg);
    }


    @Override
    public Complexe divisePar(Complexe c) {
        double newMod = this.getMod() / c.getMod();
        double newArg = this.getArg() - c.getArg();
        return new ComplexeMA(newMod, newArg);
    }

    @Override
    public Complexe conjugue() {
        return new ComplexeMA(module, -argument);
    }

    @Override
    public Complexe puissance(double x) {
        double newMod = Math.pow(this.getMod(), x);
        double newArg = this.getArg() * x;
        return new ComplexeMA(newMod, newArg);
    }

    @Override
    public Complexe ln() {
        return new ComplexeMA(Math.log(this.getMod()), this.getArg());
    }

    @Override
    public String toString() {
        return module + " * e^(i * " + argument + ")";
    }
    
	public static void main(String[] args) {
		Complexe c1 = new ComplexeMA(2, Math.PI / 2);
		Complexe c2 = new ComplexeMA(3, Math.PI / 3);
		Complexe c3 = c1.plus(c2);
		System.out.println(c3);
	}
}


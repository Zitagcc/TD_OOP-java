package td4;

public class Element implements Priorisable {
    private int priorite;

    public Element(int priorite) {
        this.priorite = priorite;
    }

    @Override
    public int getPriorite() {
        return priorite;
    }

    @Override
    public String toString() {
        return "Element(priorité=" + priorite + ")";
    }
}



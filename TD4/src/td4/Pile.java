package td4;

public class Pile<E> extends PileFile<E>{
	
	public Pile() {
        super(); // calls the constructor of the superclass
    }
    
    public void empiler(E e) {
        rep.add(e);
    }
    
    public E depiler() {
        if (estVide()) {
            throw new PileFileException("La pile est vide");
        }
        return rep.remove(rep.size() - 1);
    }

	public E sommet() {
        if (estVide()) {
            throw new PileFileException("La pile est vide");
        }
        return rep.get(rep.size() - 1);
    }
    
    public static void main(String[] args) {
        Pile<String> p = new Pile<>();
        //System.out.println(p.estVide());
        p.empiler("a");
        p.empiler("b");
        p.empiler("c");
        //System.out.println(p.sommet());
        
        System.out.println(p.toString());
        System.out.println(p.sommet());
    }
	

}

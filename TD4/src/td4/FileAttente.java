package td4;

public class FileAttente<E> extends PileFile<E> {
	
	public FileAttente() {
		super(); // calls the constructor of the superclass
	}

	public void enfiler(E e) {
		rep.add(e); // add at the end of the list
	}

	public E defiler() {
		if (estVide()) {
			throw new PileFileException("La file est vide");
		}
		return rep.remove(0); // remove the first element
	}

	public E premier() {
		if (estVide()) {
			throw new PileFileException("La file est vide");
		}
		return rep.get(0); // get the first element
	}
	
	public E dernier() {
		if (estVide()) {
			throw new PileFileException("La file est vide");
		}
		return rep.get(rep.size() - 1); // get the last element
	}

	public static void main(String[] args) {
		FileAttente<Integer> f = new FileAttente<>();
		System.out.println(f.estVide());
		f.enfiler(1);
		f.enfiler(2);
		f.enfiler(3);
		System.out.println(f);
		//System.out.println(f.premier());
		//System.out.println(f.defiler());
		System.out.println(f.defiler());
		System.out.println(f.defiler());
		System.out.println(f.estVide());
		System.out.println(f.premier());
	}

}

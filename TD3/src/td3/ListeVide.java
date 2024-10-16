package td3;

public class ListeVide extends Liste {

    public ListeVide() {
    }

    public String toString() {
        return "[]";
    }

    public boolean equals(Object obj) {
        return obj instanceof ListeVide;
    }
}

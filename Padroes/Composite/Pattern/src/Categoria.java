import java.util.ArrayList;
import java.util.List;

import Composite.Roupas;

public class Categoria implements Roupas{

    private List<Roupas> childRoupa;

    public Categoria() {
        this.childRoupa = new ArrayList<>();
    }

    public void printRoupaCategoria() {
        childRoupa.forEach(Roupas::printRoupaCategoria);
    }

    public void addRoupa(Roupas roupas) {
        childRoupa.add(roupas);
    }

    public void removeRoupa(Roupas roupas) {
        childRoupa.remove(roupas);
    }

}

import Composite.Feminino;
import Composite.Masculino;

public class App {
    public static void main(String args[]) {
        Categoria categoria = new Categoria();

        categoria.addRoupa(new Feminino());
        categoria.addRoupa(new Masculino());
        categoria.printRoupaCategoria();
    }
}
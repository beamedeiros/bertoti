public class Circulo implements Forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de círculo com cor "+corDesenho);
	}

    public void adicionar(){
        System.out.println("Círculo adicionado.");
    }

    public void remover(){
        System.out.println("Círculo removido.");
    }
}
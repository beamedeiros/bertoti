public class Triangulo implements Forma{
    @Override
	public void desenho(String corDesenho) {
		System.out.println("Desenho de triângulo com cor "+corDesenho);
	}    

    public void adicionar(){
        System.out.println("Triângulo adicionado.");
    }

    public void remover(){
        System.out.println("Triângulo removido.");
    }
}
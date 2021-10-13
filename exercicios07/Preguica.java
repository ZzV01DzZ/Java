package exercicios07;

public class Preguica extends AnimaisClasse implements AnimaisInterface {

	@Override
	public void nome(String nome) {
		System.out.println("O nome do cavalo é: " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("A preguiça tem: "+ idade+ " anos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da Preguiça é: zzzzzzZZ " );

	}

	@Override
	public void correr() {
		super.correr();
	}

	@Override
	public void subir() {
		super.subir();
		System.out.println("A preguiça está subindo a árvore...");
	}
	

}

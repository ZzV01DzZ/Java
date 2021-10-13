package exercicios07;

public class Cachorro extends AnimaisClasse implements AnimaisInterface  {

	@Override
	public void nome(String nome) {
		System.out.println("O nome do cachorro é: " + nome);
	}

	@Override
	public void idade(int idade) {
		System.out.println("O cachorro tem: "+ idade+ " anos.");
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do Cachorro é: Au Au Au!! " );
		
	}

	@Override
	public void correr() {
		System.out.println("Cachorro está correndo...");
		
	}

	@Override
	public void subir() {
		// TODO Auto-generated method stub
		
	}  
	

}

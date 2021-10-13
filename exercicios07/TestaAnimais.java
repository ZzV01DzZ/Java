package exercicios07;

public class TestaAnimais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		System.out.println("--> Cachorro <--");
		dog.nome("Godofredo");
		dog.idade(19);
		dog.emitirSom();
		dog.correr();
		
		System.out.println("\n--> Cavalo <--");
		horse.nome("Alado");
		horse.idade(17);
		horse.emitirSom();
		horse.correr();
		
		System.out.println("\n--> Preguiça <--");
		sloth.nome("Flecha");
		sloth.idade(40);
		sloth.emitirSom();
		sloth.subir();
		

	}

}

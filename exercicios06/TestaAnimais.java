package exercicios06;

public class TestaAnimais {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.setNome("Hachiko");
		dog.setIdade(11);
		dog.setSom("Au! Au! Au!");
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade());
		System.out.println("Som emitido: " + dog.getSom());
		dog.correr();
		
		
		horse.setNome("Manco");
		horse.setIdade(7);
		horse.setSom("hiin in in hinir!");
		
		System.out.println("\nNome do Cavalo: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade());
		System.out.println("Som emitido: " + horse.getSom());
		horse.correr();
		
		sloth.setNome("Flecha");
		sloth.setIdade(44);
		sloth.setSom("zzzzZZZZZZ");
		
		System.out.println("\nNome do Bicho-Preguiça: " + sloth.getNome());
		System.out.println("Idade: " + sloth.getIdade());
		System.out.println("Som emitido: " + sloth.getSom());
		sloth.subir();
		
	}

}

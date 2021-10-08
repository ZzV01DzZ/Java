package ex1;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Zé");
		cliente1.setIdade(19);
		cliente1.setCpf(53680972040L);
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: " +cliente1.getIdade());
		System.out.println("CPF: " +cliente1.getCpf());
		
		
				
	}

}

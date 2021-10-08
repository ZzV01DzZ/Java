package ex2;

public class TestaAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		
		aviao1.setModelo("747");
		aviao1.setFabricante("Boeing");
		aviao1.setAno(2001);
		aviao1.setCapacidade(660);
		
		
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Fabricante: " + aviao1.getFabricante());
		System.out.println("Ano: " + aviao1.getAno());
		System.out.println("Capacidade: " + aviao1.getCapacidade()+" passageiros");
		
		aviao1.decolar(300);
		System.out.println("Velocidade para Decolar: " + aviao1.getVelocidade());
		
		aviao1.voar(150);
		System.out.println("Velocidade de cruzeiro: " + aviao1.getVelocidade());
		
		aviao1.pousar();
		System.out.println("Velocidade de pouso: " + aviao1.getVelocidade());
		
	}
}

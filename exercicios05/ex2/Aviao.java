package ex2;

public class Aviao {

	private String modelo;
	private String fabricante;
	private int ano;
	private int capacidade;
	private float velocidade;
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	void decolar(int aceleracao){
		velocidade = velocidade + aceleracao;
	}
	
	void voar(int cruzeiro) {
		velocidade -= cruzeiro;
	}
	
	void pousar() {
		velocidade /= 2;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
 
}

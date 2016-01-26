package alieni;

public class Giocatore {

	String nome;
	int salute;
	
	public Giocatore(String name, int health){
		nome=name;
		salute=health;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalute() {
		return salute;
	}

	public void setSalute(int salute) {
		this.salute = salute;
	}
}

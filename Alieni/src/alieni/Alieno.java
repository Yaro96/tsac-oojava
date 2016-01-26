package alieni;

public class Alieno {

	String nome;
	int danno;
	
	public Alieno(String name, int damage){
		nome=name;
		danno=damage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDanno() {
		return danno;
	}

	public void setDanno(int danno) {
		this.danno = danno;
	}
}

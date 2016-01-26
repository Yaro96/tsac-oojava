package Bershadskyy.Yaroslav.azienda;

public class Contratto {

	String nome;
	int stipendioBase;
	
	public Contratto(String contractName, int salary) {
		nome=contractName;
		stipendioBase=salary;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nomeContratto) {
		this.nome = nomeContratto;
	}

	public int getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(int stipendio) {
		this.stipendioBase = stipendio;
	}
}

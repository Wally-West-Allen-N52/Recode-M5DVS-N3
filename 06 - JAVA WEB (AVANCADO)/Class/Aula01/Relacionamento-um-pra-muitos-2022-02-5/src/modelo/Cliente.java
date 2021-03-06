package modelo;

public class Cliente {

	private int id;
	private String nome;
	// REFER?NCIA PARA LIGA??O ENTRE "CLIENTE" E "CONTA"(1,1)
	private Conta conta;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
}

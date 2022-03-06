package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int id;
	private String nome;
	// REFERÊNCIA PARA LIGAÇÃO ENTRE "CLIENTE" E "CONTA"(1,*)
	private List<Conta> contas; // LISTA "ARRAY POR TRAS"
	
	public Cliente() {
		super();
		contas = new ArrayList<Conta>();
	}

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// ============== ID/NOME =========================
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

	// ============== ID/NOME =========================
	
	public List<Conta> getContas() { // LISTA "ARRAY POR TRAS", POSSO RETORNAR UMA OU VARIAS CONTAS
		return contas;
	}

	public void setContas(List<Conta> contas) { // LISTA "ARRAY POR TRAS", POSSO RECEBER UMA OU VARIAS CONTAS
		this.contas = contas;
	}
	
	public void add(Conta conta) {
		contas.add(conta); // ADD UMA CONTA À LISTA
	}
	public Conta getConta(int pos) {
		return contas.get(pos);
	}
	
}

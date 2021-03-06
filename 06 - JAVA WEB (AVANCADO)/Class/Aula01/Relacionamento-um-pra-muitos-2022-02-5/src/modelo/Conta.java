package modelo;

public class Conta {

	private String agencia;
	private String conta;
	// REFER?NCIA PARA LIGA??O ENTRE "CONTA" E "CLIENTE"(1,1)
	private Cliente cliente;
	
	public Conta() {
		super();
	}

	public Conta(String agencia, String conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

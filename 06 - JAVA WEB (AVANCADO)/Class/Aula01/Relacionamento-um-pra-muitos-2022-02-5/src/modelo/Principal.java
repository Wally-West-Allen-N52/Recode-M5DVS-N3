package modelo;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		cliente.setId(10);
		cliente.setNome("Wallace");

		conta.setAgencia("101010");
		conta.setConta("70707070");

		System.out.println("ID: " + cliente.getId()); // CLIENTE TEM ACESSO A "ID DE CLIENTE"
		System.out.println("Nome: " + cliente.getNome()); // CLIENTE TEM ACESSO A "NOME DE CLIENTE"

		System.out.println("Conta: " + conta.getAgencia()); // CONTA TEM ACESSO A "AGENCIA DE CONTA"
		System.out.println("N?Conta: " + conta.getConta()); // CONTA TEM ACESSO A "CONTA DE CONTA"

	}

}

package modelo;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		cliente.setId(10);
		cliente.setNome("Wallace");

		conta.setAgencia("101010");
		conta.setConta("70707070");

		cliente.add(conta); // 

		System.out.println("ID: " + cliente.getId()); // CLIENTE TEM ACESSO A "ID DE CLIENTE"
		System.out.println("Nome: " + cliente.getNome()); // CLIENTE TEM ACESSO A "NOME DE CLIENTE"

		System.out.println("Conta: " + cliente.getConta(0).getAgencia()); // ACESSO A "AGENCIA DE CONTA"
		System.out.println("N?Conta: " + cliente.getConta(0).getConta()); // CONTA TEM ACESSO A "CONTA DE CONTA"

	}

}

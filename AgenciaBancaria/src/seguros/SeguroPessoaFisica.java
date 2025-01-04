package seguros;

import contas.Conta;

public class SeguroPessoaFisica {

	public static void main(String[] args) {
		
		Conta cc4 = new Conta();
		cc4.setCliente ("Luizão");
		cc4.setSaldo (9000);
		System.out.println("Cliente: " + cc4.getCliente());
		cc4.exibirSaldo();
	}

}

package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Daniel Martins");
		cc1.setSaldo (3000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(500);
		cc1.exibirSaldo();
		
		System.out.println("---------------------");
		
		
		Conta cc2 = new Conta();
		cc2.setCliente ("Susana Volpe");
		cc2.setSaldo (2500);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(1500);
		cc2.exibirSaldo();
		
		
		System.out.println("---------------------");
		
		System.out.println("Tranferencia");
		System.out.println("Cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		
		cc1.transferir(cc2, 1000);
		System.out.println(" ");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		System.out.println("---------------------");
		
		//System.out.println("Tranferencia");
		System.out.println("Relatório Gerencial");
		
		Conta gerente = new Conta();
		double relatorio  = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo Total: " + relatorio);
	}

}

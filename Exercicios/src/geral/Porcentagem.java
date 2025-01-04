package geral;

import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		double valorTotal;
		double desconto;
		double totalDesconto;
		double valorPago;
		double troco;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		valorTotal = teclado.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		desconto = teclado.nextDouble();
		
		totalDesconto = (valorTotal * desconto) / 100;
		troco = (valorTotal - totalDesconto);
		
		valorPago = valorTotal;
		
		System.out.println("O desconto foi: " + desconto + "%");
		System.out.println("O valor pago foi de : R$" + valorPago );
		System.out.println("Valor final do produto é: R$" + troco);
		System.out.println("O troco é: R$" + totalDesconto);
		
		teclado.close();

	}

}

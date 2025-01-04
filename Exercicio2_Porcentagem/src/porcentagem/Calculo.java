package porcentagem;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculo {

	public static void main(String[] args) {
		double a,b,c;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		System.out.println("Calculo de Porcentagem ");
		System.out.println("Digite o numero inteiro: ");
		a = teclado.nextDouble();
		
		System.out.println("Digite a porcentagem: ");
		b = teclado.nextDouble();
		
		c = (b * a) /100;
		
		System.out.println("O calculo é: " + formatador.format(c) + "%");
		teclado.close();
	}

}

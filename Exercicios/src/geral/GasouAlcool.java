package geral;


import java.util.Scanner;

public class GasouAlcool {
	public static void main(String[] args) {
		double gasolina, alcool;
		double calculo1,calculo2, desempenho;
		double resultado1;
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o preço da gasolina: ");
		gasolina = teclado.nextDouble();
		
		System.out.println("Digite o valor do alcool: ");
		alcool = teclado.nextDouble();
		
		System.out.println("Quanto KM o carro faz por litro: ");
		desempenho = teclado.nextDouble();
		
		calculo1 = (alcool * desempenho);
		calculo2 = (gasolina * desempenho);
		
		resultado1 = (calculo1 * 70) / 100;
		
		if (resultado1 <= 70% calculo2 ) {
			System.out.println("Abastecer com alcool");
		
		} else if (resultado1 > 70% calculo2) {
			System.out.println("Abastecer com gasolina");
		}
		teclado.close();
		
	}

}

package Farenheit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class farenheit {

	public static void main(String[] args) {
		//Variáveis
		double c,f;
		//Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//Entrada
		System.out.println("Conversão de Temperatura: ");
		System.out.print("Digite a temperatura em Farenheit: ");
		f = teclado.nextDouble();
		c = (f - 32) / 1.8;
		//Saida
		System.out.println("Temperatura em Celcius: " + formatador.format(c) + "ºC");
		teclado .close();
	}
}
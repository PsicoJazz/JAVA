package geral;

import java.util.Scanner;

public class HoraTrabalho {

	public static void main(String[] args) {
		double remuneraçaoM, custoOp, ch;
		double  imposto;
		double investimento;
		double total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a remuneração mensal: ");
		remuneraçaoM = teclado.nextDouble();
		
		System.out.println("Digite o custo operacional: ");
		custoOp = teclado.nextDouble();
		
		System.out.println("Digite a carga horária: ");
		ch = teclado.nextDouble();
		
		imposto = (remuneraçaoM * 30) / 100;
		investimento = (remuneraçaoM * 20) / 100;
		
		total = (remuneraçaoM + custoOp + imposto + investimento) / ch;
		System.out.println("O valor da hora trabalhada é: " + total);
		teclado.close();
		

	}

}

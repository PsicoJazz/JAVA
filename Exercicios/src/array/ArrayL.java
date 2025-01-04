package array;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		
		contatos.add("Daniel Martins");
		contatos.add("999999999");
		contatos.add("dani@gmail.com");
		
		contatos.add("Susana Volpe");
		contatos.add("22222222222");
		contatos.add("susy@gmail.com");
		
		//Tamanho do array
		System.out.println("Tamanho: " + contatos.size());
		
		//Elementos array
		System.out.println(contatos);
		
		//Elementos em um índice
		System.out.println("Email Daniel: " + contatos.get(2));
		
		//Obter todos os elemtentos
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println("Array completo: " + contatos.get(i));
		}
		
		
	}
	

}

package array;

public class Array1 {

	public static void main(String[] args) {
		
		String[] carros = {"ferrari", "fusca", "camaro", "uno"};
        //índice do array    [0]        [1]       [2]     [3]
		
		
		//Tamanho do array
		System.out.println("Tamanho do array: " + carros.length);
		
		//Elemento de um índice
		System.out.println("Carro: " + carros[2]);
		
		//Modificar conteúdo
		carros[2] = "porsche";
		System.out.println("Carro: " + carros[2]);
		
		//Todos os elementos
		System.out.println("------------------");
		
		System.out.println("Carros: ");
		for (int i = 0; i < carros.length; i++) {
			System.out.println(carros[i]);
			
		}
			
		}
	}



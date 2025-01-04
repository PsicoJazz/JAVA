package array;

public class jogoCarta {
	public static void main(String[] args) {
		
		String[] naipes = {"Ouros", "Copas", "Espadas", "Zap"};
		String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q","J","K"};
		
		//Recuperar elementos aleatoriamente
		String naipe = naipes[(int) (Math.random() *4) ];
		String face = faces[(int) (Math.random() * faces.length) ];
		
		//Imprimir carta sorteada
		System.out.println("A cartas é: " + face +" de " +  naipe);
	}

}

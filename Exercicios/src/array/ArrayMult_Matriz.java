package array;

public class ArrayMult_Matriz {

	public static void main(String[] args) {
		
		String[][] agenda = {{"Daniel","99866","professor"}, {"Susana", "99775", "biologa"},{"Anastacia", "Não", "filha"}};

		//Recuperar dados (linha, coluna)
		System.out.println(agenda[0][2]);
		
		//Recuperar tabela toda
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_________________________________");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}			
		}
	}

}

package curso;

public class Vetor2 {

	public static void main(String[] args) {
		//String frutas[] = {"Banana","Maçã", "Uva", "Maracujá", "Morango"};
		
		String frutas[] = new String[5];
		String frutas2[] = {"Banana","Maçã", "Uva", "Maracujá", "Morango"};
		frutas = frutas2;
		
		System.out.println(frutas[3]);
		
		for(int i = 0; i < frutas2.length; i++) {
			if(frutas[i].equals("Banana")) {
				System.out.println("Fruta: " + frutas2[i]);
			}
			
		}
		//foreach
		for(String elemento: frutas2) {
			System.out.println("Fruta: " + elemento);
		}
	}

}

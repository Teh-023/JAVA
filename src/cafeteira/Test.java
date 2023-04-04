package cafeteira;

public class Test {

	public static void main(String[] args) {
		
		Cafeteira cafeteira = new Cafeteira();
		cafeteira.marca = "Arno";
		cafeteira.modelo = "A1";
		cafeteira.tipo = "Capsula";
		
		
		Cafeteira cafeteira2 = new Cafeteira();
		cafeteira2.marca = "Philco";
		cafeteira2.modelo = "Ph1";
		cafeteira2.tipo = "Filtro";
		
		
		
		System.out.println("Cafeteira 1: " + cafeteira.toString());
		System.out.println("Cafeteira 2: " + cafeteira2.toString());

	}

}

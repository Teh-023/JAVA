package Lista2_OO;

public class ContaTeste {

	public static void main(String[] args) {
		
		Contacorrente contacorrente = new Contacorrente("João Moura", 1500.00, "123456700", 500.00, 350.00);
		Contaespecial contaespecial = new Contaespecial("João Moura", 1500.00, "123456700", 500.00, 350.00, 0.00);
		
		
		System.out.println("Seu limite de saque é:R$ " + contaespecial.saque(0));
		
		
	
	}

}

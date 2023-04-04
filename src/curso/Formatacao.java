package curso;

import java.text.DecimalFormat;

public class Formatacao {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		float pagamento = 2583.75f;
		df.applyPattern("R$ #, ##0.00");
		System.out.println("Pagamento: " + df.format(pagamento));

	}

}

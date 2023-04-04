package curso;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Localizacao {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1370.25;
		if(local.getCountry().equals("BR")) {
			df.applyPattern("R$ #, ##0.00");
		}
		JOptionPane.showMessageDialog(null, "COnfigurações do SO: "
				                      + "\nSigla: " + local.getCountry()
		                              + "\nPaís: " + local.getDisplayCountry()
		                              + "\nIdioma: " + local.getDisplayCountry()
		                              + "\nDisplay Name: " + local.getDisplayCountry()
		                              + "\nISO: " + local.getISO3Country());
	}

}

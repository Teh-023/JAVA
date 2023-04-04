package Lista1_OO;

import java.text.DecimalFormat;

public class TestEmpregados {

	public static void main(String[] args) {
	      DecimalFormat df = new DecimalFormat();
	        df.applyPattern("R$ #,##0.00");
	        
	    Empregado empregado1 = new Empregado("Marcelo", "Silva", 3500.00);
	    System.out.println("Empregado: " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome() + " Salário mensal: " + df.format(empregado1.getSalarioMensal()) + "Salário anual: " + df.format(empregado1.getSalarioMensal()));
	    Empregado empregado2 = new Empregado("Luiz", "Souza", 10000.00);
	    System.out.println("Empregado: " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome() + " Salário mensal: " + df.format(empregado2.getSalarioMensal())  + "Salário anual: " + df.format(empregado2.getSalarioMensal()));

	    
	    empregado1.aumento();
	    System.out.println("Empregado: " + empregado1.getPrimeiroNome());
	    System.out.println("Novo salário mensal: " + df.format(empregado1.getSalarioMensal()));
	    System.out.println("Novo salário anual: " + df.format(empregado1.getSalarioMensal()));

	    empregado2.aumento();
	    System.out.println("Empregado: " + empregado2.getPrimeiroNome());
	    System.out.println("Novo salário mensal: " + df.format(empregado2.getSalarioMensal()));
	    System.out.println("Novo salário anual: " + df.format(empregado2.getSalarioMensal()));
	}
	}

	
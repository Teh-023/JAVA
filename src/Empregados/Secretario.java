package Empregados;

public class Secretario {
	
	String nome;
	
	public void enviarEmail(String emailDestinatario, String cc, String assunto, String conteudo) {
		
		String fullemail = 
				"Assunto: " + assunto
				+ "\nConteudo: " + conteudo
				+ "\nDestinatário: " + emailDestinatario
				+ "\nCC: " + cc;
		
		System.out.println(fullemail);
	}
}

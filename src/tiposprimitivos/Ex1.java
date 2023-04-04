package tiposprimitivos;

import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/* 1 - Crie uma classe que receba o valor de um produto e a 
        porcentagem de desconto, calcule e mostre o valor do desconto 
        e o valor do produto com o desconto. Observação: o valor do desconto 
        é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100. 
        */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valor = scan.nextInt();
		
		System.out.println("Digite a porcentagem de desconto: ");
		double desconto = scan.nextFloat();
		
		
		double valorComDesconto = valor * desconto /100;
		
		double total = valor - valorComDesconto;
		
		JOptionPane.showMessageDialog(null, "O valor do produto com desconto é: R$ " + total);
		


	}

}

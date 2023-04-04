package Lista1_OO;

import java.util.Locale;
import java.text.DecimalFormat;

public class TestInvoice {

	public static void main(String[] args) {
		
			DecimalFormat df = new DecimalFormat();
			
			Invoice fatura = new Invoice(20002, "Notebook", 1, "3.500");
					df.applyPattern("R$ #, ##0.00");
			System.out.println("Descricao do Produto: " + fatura.getDescricaoItem());
	        System.out.println("Quantidade Comprada: " + fatura.getQtdeComprada());
	        System.out.println("Preço Unitário" + df.format(fatura.getPrecoUnidade()));
	        System.out.println("Valor da Nota: " + df.format(fatura.GetInvoiceAmount()));
		}
	}

	
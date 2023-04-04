package Lista2_OO;

public class Teste {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor("Maria Odete Cabral", "Rua Mario Quintino, 123", "555-1234", 1000, 500);

        System.out.println("Nome do fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço do fornecedor: " + fornecedor.getEndereco());
        System.out.println("Telefone do fornecedor: " + fornecedor.getTelefone());
        System.out.println("Valor de crédito do fornecedor: " + fornecedor.getValorCredito());
        System.out.println("Valor da dívida do fornecedor: " + fornecedor.getValorDivida());
        System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());
        
        
        Empregado empregado = new Empregado("João Couto", 30, "123.456.789-00", 1, 2000.00, 10);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Idade: " + empregado.getIdade());
        System.out.println("CPF: " + empregado.getcpf());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário líquido: " + empregado.calcularSalario());
    
        
        Administrador administrador = new Administrador("Lucas Reis", "Rua 87, 453", "33987800",
                "RH", 5000.00, 10.00, 1000.00);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getcodigoSetor);
        System.out.println("Salário base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto());
        System.out.println("Ajuda de custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário líquido: " + administrador.calcularSalario());
        
        Operario operario = new Operario("Marcela Rios", "Rua Julio de Faria, 13", "999890098",
                "OP1", 2500.00, 25.0, 800.00);
        double salario = operario.calcularSalario();

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodigoSetor());
        System.out.println("Salário base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário: " + salario);
        
        Vendedor vendedor = new Vendedor("GianCarlo Botelho", "Rua 45, 659", "32456677",
                "VED", 1950.00, 30.0, 500.00);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário: " + vendedor.calcularSalario());
        
    }

}



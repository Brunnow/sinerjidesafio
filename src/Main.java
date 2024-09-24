

import br.com.sinerji.model.Funcionario;
import br.com.sinerji.model.Gerente;


import br.com.sinerji.model.Secretario;
import br.com.sinerji.model.Vendedor;
import br.com.sinerji.service.Empresa;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        // Criando funcionários
        Secretario secretario1 = new Secretario("Jorge Carvalho", 2018);
        Secretario secretario2 = new Secretario("Maria Souza", 2015);

        Vendedor vendedor1 = new Vendedor("Ana Silva", 2021);
        vendedor1.registrarVenda(2021, 12, 5200);
        vendedor1.registrarVenda(2022, 1, 4000);

        Vendedor vendedor2 = new Vendedor("João Mendes", 2021);
        vendedor2.registrarVenda(2021, 12, 3400);
        vendedor2.registrarVenda(2022, 1, 7700);

        Gerente gerente1 = new Gerente("Juliana Alves", 2017);
        Gerente gerente2 = new Gerente("Bento Albino", 2014);


        funcionarios.add(secretario1);
        funcionarios.add(secretario2);
        funcionarios.add(vendedor1);
        funcionarios.add(vendedor2);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);


        Empresa empresa = new Empresa(funcionarios);


        System.out.println("Total pago em 01/2022: " + empresa.calcularTotalPago(2022, 1));
        System.out.println("Total pago somente em salários em 01/2022: " + empresa.calcularTotalSalarios(2022, 1));
        System.out.println("Total pago somente em benefícios em 01/2022: " + empresa.calcularTotalBeneficios(2022, 1));
        System.out.println("Funcionário com maior salário em 01/2022: " + empresa.calcularMaiorSalario(2022, 1).getNome());
        System.out.println("Funcionário com maior benefício em 01/2022: " + empresa.calcularMaiorBeneficio(2022, 1).getNome());
        System.out.println("Vendedor com mais vendas em 01/2022: " + empresa.vendedorComMaisVendas(2022, 1).getNome());

        // Testando em outro mês (12/2021)
        System.out.println("Total pago em 12/2021: " + empresa.calcularTotalPago(2021, 12));
        System.out.println("Funcionário com maior salário em 12/2021: " + empresa.calcularMaiorSalario(2021, 12).getNome());
        System.out.println("Vendedor com mais vendas em 12/2021: " + empresa.vendedorComMaisVendas(2021, 12).getNome());
    }
}
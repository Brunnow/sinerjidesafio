package br.com.sinerji.service;

import br.com.sinerji.model.Funcionario;
import br.com.sinerji.model.Vendedor;

import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    // 1. Total pago (salário e benefícios) no mês
    public double calcularTotalPago(int ano, int mes) {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            // Inclui salário e benefício
            total += f.calcularSalario(ano, mes) + f.calcularBeneficio(ano);
        }
        return total;
    }

    // 2. Total pago somente em salários no mês
    public double calcularTotalSalarios(int ano, int mes) {
        double totalSalarios = 0.0;
        for (Funcionario f : funcionarios) {
            totalSalarios += f.calcularSalario(ano, mes);
        }
        return totalSalarios;
    }

    // 3. Total pago somente em benefícios no ano
    public double calcularTotalBeneficios(int ano) {
        double totalBeneficios = 0.0;
        for (Funcionario f : funcionarios) {
            totalBeneficios += f.calcularBeneficio(ano);
        }
        return totalBeneficios;
    }

    // 4. Funcionário com maior salário no mês
    public Funcionario calcularMaiorSalario(int ano, int mes) {
        Funcionario maior = null;
        double maiorSalario = 0.0;

        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario(ano, mes);
            if (salario > maiorSalario) {
                maiorSalario = salario;
                maior = f;
            }
        }

        return maior;
    }

    // 5. Funcionário que recebeu o maior benefício
    public Funcionario calcularMaiorBeneficio(int ano) {
        Funcionario maiorBeneficiado = null;
        double maiorBeneficio = 0.0;

        for (Funcionario f : funcionarios) {
            double beneficio = f.calcularBeneficio(ano);
            if (beneficio > maiorBeneficio) {
                maiorBeneficio = beneficio;
                maiorBeneficiado = f;
            }
        }

        return maiorBeneficiado;
    }

    // 6. Vendedor que mais vendeu no mês
    public Vendedor vendedorComMaisVendas(int ano, int mes) {
        Vendedor melhorVendedor = null;
        double maiorVenda = 0.0;

        for (Funcionario f : funcionarios) {
            if (f instanceof Vendedor) {
                Vendedor v = (Vendedor) f;
                double vendas = v.getVendas(ano, mes);
                if (vendas > maiorVenda) {
                    maiorVenda = vendas;
                    melhorVendedor = v;
                }
            }
        }

        return melhorVendedor;
    }
}
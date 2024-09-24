package br.com.sinerji.model;

public class Secretario extends Funcionario {
    private static final double SALARIO_BASE = 7000.00;

    public Secretario(String nome, int anoContratacao) {
        super(nome, anoContratacao);
    }

    @Override
    public double calcularSalario(int ano, int mes) {
        int anosTrabalhados = ano - anoContratacao;
        return SALARIO_BASE + (anosTrabalhados * 1000);
    }

    @Override
    public double calcularBeneficio(int ano) {
        int anosTrabalhados = ano - anoContratacao;
        return anosTrabalhados * 1000;
    }
}

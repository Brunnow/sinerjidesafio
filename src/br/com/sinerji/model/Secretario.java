package br.com.sinerji.model;

public class Secretario extends Funcionario {
    public  Secretario(String nome, int anoContratacao) {
        super(nome, "secretario", anoContratacao, 7000.00);
    }
    @Override
    public double calcularSalario(int ano, int mes){
        int anosTrabalhados = ano - anoCntratacao;
        return salarioBase + (anosTrabalhados * 1000);
    }
    @Override
    public double calcularBeneficios(int ano, int mes){
        int anosTrabalhados = ano - anoCntratacao;
        return anosTrabalhados * 1000;
    }

}

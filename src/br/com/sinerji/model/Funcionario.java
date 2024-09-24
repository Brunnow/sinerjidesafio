package br.com.sinerji.model;

public abstract class Funcionario {
    protected String nome;
    protected int anoContratacao;

    public Funcionario(String nome, int anoContratacao) {
        this.nome = nome;
        this.anoContratacao = anoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario(int ano, int mes);
    public abstract double calcularBeneficio(int ano);
}
package br.com.sinerji.model;

public class Funcionario {
    protected String nome;
    protected String cargo;
    protected int anoCntratacao;
    protected double salarioBase;

    public Funcionario(String nome, String cargo, int anoCntratacao, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.anoCntratacao = anoCntratacao;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

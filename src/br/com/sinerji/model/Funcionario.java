package br.com.sinerji.model;

public abstract class Funcionario {
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
    public abstract double calcularSalario(int ano, int mes);
    public abstract double calcularBeneficios(int ano, int mes);

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

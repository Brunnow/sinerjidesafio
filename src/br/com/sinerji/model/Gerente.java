package br.com.sinerji.model;


import java.util.HashMap;
import java.util.Map;

public class Gerente extends Funcionario {
    private static final double SALARIO_BASE = 20000.00;
    private Map<String, Double> vendasMensais;

    public Gerente(String nome, int anoContratacao) {
        super(nome, anoContratacao);
        vendasMensais = new HashMap<>();
    }

    public void registrarVenda(int ano, int mes, double valor) {
        String chave = ano + "-" + mes;
        vendasMensais.put(chave, valor);
    }

    public double getVendas(int ano, int mes) {
        String chave = ano + "-" + mes;
        return vendasMensais.getOrDefault(chave, 0.0);
    }

    @Override
    public double calcularSalario(int ano, int mes) {
        int anosTrabalhados = ano - anoContratacao;
        return SALARIO_BASE + (anosTrabalhados * 3000) + getVendas(ano, mes) * 0.30;
    }

    @Override
    public double calcularBeneficio(int ano, int mes) {
        return 0; // Gerente não tem benefício fixo além da comissão sobre vendas
    }
}



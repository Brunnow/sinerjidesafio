package br.com.sinerji.service;

import br.com.sinerji.model.Funcionario;

import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    public double calcularTotalPago(int ano, int mes){
        double total = 0.0;
        for (funcionario f: funcionarios){
            total+=f.calcularSalario(ano,mes);
        }
        return total;
    }
    public double calcularTotalSalarios(int ano, int mes){
        double totalSalarios = 0.0;
        for (Funcionario f: funcionarios){
            totalSalarios+= f.getSalarioBase();
        }
        return totalSalarios;
    }
    public double calcularTotalBeneficios(int ano, int mes){
        double totalbeneficios = 0.0;
        for (Funcionario f : funcionarios){
            if (f instanceof Vendedor || f instanceof Secretario || f instanceof  Gerente){
                totalbeneficios += f.calcularBeneficios(ano, mes);
            }
        }
        return totalbeneficios;
    }



}

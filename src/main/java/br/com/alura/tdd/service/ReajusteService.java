package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void reajustarSalario(Funcionario funcionario, Desempenho desempenho) {
           BigDecimal valorReajuste =  funcionario.getSalario().multiply(desempenho.porcentagemReajuste());
           funcionario.aplicarAumento(valorReajuste);
    }
}

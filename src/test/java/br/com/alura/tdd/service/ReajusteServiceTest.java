package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    void reajusteDeveriaSerTresPorCentoDesemprenhoADesejar(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.reajustarSalario(funcionario, Desempenho.A_DESEJAR);

        BigDecimal salarioEsperado = new BigDecimal("1030.00");
        assertEquals(salarioEsperado, funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerDezPorCentoDesemprenhoBom(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.reajustarSalario(funcionario, Desempenho.BOM);

        BigDecimal salarioEsperado = new BigDecimal("1100.00");
        assertEquals(salarioEsperado, funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerTrintaPorCentoDesemprenhoOtimo(){
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.reajustarSalario(funcionario, Desempenho.OTIMO);

        BigDecimal salarioEsperado = new BigDecimal("1300.00");
        assertEquals(salarioEsperado, funcionario.getSalario());
    }
}

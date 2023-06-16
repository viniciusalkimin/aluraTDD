package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void deveriaDevolverZeroComoBonus() {

        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(25000));
        BonusService bonusService = new BonusService();
        assertThrows(RuntimeException.class,
                () -> bonusService.calcularBonus(funcionario));
    }

    @Test
    void deveriaDevolverCemReaisComoBonus() {

        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(1000));
        BonusService bonusService = new BonusService();
        assertEquals(BigDecimal.valueOf(100.0), bonusService.calcularBonus(funcionario));
    }

    @Test
    void deveriaDevolverMilReaisComoBonus() {

        Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal(10000));
        BonusService bonusService = new BonusService();
        assertEquals(BigDecimal.valueOf(1000.0), bonusService.calcularBonus(funcionario));
    }

}
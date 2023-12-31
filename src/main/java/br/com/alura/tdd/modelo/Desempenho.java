package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR {
        @Override
        public BigDecimal porcentagemReajuste() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal porcentagemReajuste() {
            return new BigDecimal("0.10");
        }
    },
    OTIMO {
        @Override
        public BigDecimal porcentagemReajuste() {
            return new BigDecimal("0.30");
        }
    };

    public abstract BigDecimal porcentagemReajuste();

}

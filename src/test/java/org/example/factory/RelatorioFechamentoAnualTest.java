package org.example.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFechamentoAnualTest {

    @Test
    void deveExecutarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("FechamentoAnual");
        assertEquals("O relatório de fechamento anual foi gerado com sucesso!", geradorRelatorios.executarGeracaoRel());
    }

    @Test
    void deveCancelarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("FechamentoAnual");
        assertEquals("A geração do relatório de fechamento anual foi cancelada.", geradorRelatorios.cancelarGeracaoRel());
    }
}
package org.example.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFechamentoMensalTest {

    @Test
    void deveExecutarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("FechamentoMensal");
        assertEquals( "Relatório de fechamento mensal gerado com sucesso!", geradorRelatorios.executarGeracaoRel());
    }

    @Test
    void deveCancelarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("FechamentoMensal");
        assertEquals("A geração do relatório mensal foi cancelada.", geradorRelatorios.cancelarGeracaoRel());
    }
}
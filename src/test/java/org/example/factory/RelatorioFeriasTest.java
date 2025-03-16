package org.example.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFeriasTest {

    @Test
    void deveExecutarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("Ferias");
        assertEquals("O relatório de férias foi gerado com sucesso!", geradorRelatorios.executarGeracaoRel());
    }

    @Test
    void deveCancelarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("Ferias");
        assertEquals("A geração do relatório de férias foi cancelada.", geradorRelatorios.cancelarGeracaoRel());
    }
}
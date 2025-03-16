package org.example.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioeSocialTest {

    @Test
    void deveExecutarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("eSocial");
        assertEquals("Relatório referente ao eSocial gerado com sucesso!", geradorRelatorios.executarGeracaoRel());
    }

    @Test
    void deveCancelarGeracaoRel() {
        IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("eSocial");
        assertEquals("Geração do relatório referente ao eSocial foi cancelada.", geradorRelatorios.cancelarGeracaoRel());
    }
}
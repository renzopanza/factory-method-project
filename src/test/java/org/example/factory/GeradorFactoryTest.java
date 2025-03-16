package org.example.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradorFactoryTest {

    @Test
    void deveRetornarExcecaoRelatorioInexistente(){
        try {
            IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("Recisao");
            fail();
        }  catch (IllegalArgumentException e){
            assertEquals("O relatório não existe", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoRelatorioInvalido(){
        try {
            IGeradorRelatorios geradorRelatorios = GeradorFactory.geradorRelatorios("AbonoPecuniario");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Relatório inválido", e.getMessage());
        }
    }
}
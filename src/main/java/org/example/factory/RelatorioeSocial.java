package org.example.factory;

public class RelatorioeSocial implements IGeradorRelatorios{
    @Override
    public String executarGeracaoRel() {
        return "Relatório referente ao eSocial gerado com sucesso!";
    }

    @Override
    public String cancelarGeracaoRel() {
        return "Geração do relatório referente ao eSocial foi cancelada.";
    }
}

package org.example.factory;

public class RelatorioFerias implements IGeradorRelatorios{
    @Override
    public String executarGeracaoRel() {
        return "O relatório de férias foi gerado com sucesso!";
    }

    @Override
    public String cancelarGeracaoRel() {
        return "A geração do relatório de férias foi cancelada.";
    }
}

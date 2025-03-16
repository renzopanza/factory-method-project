package org.example.factory;

public class RelatorioFechamentoAnual implements IGeradorRelatorios{
    @Override
    public String executarGeracaoRel() {
        return "O relatório de fechamento anual foi gerado com sucesso!";
    }

    @Override
    public String cancelarGeracaoRel() {
        return "A geração do relatório de fechamento anual foi cancelada.";
    }
}

package org.example.factory;

public class RelatorioFechamentoMensal implements IGeradorRelatorios{
    @Override
    public String executarGeracaoRel() {
        return "Relatório de fechamento mensal gerado com sucesso!";
    }

    @Override
    public String cancelarGeracaoRel() {
        return "A geração do relatório mensal foi cancelada.";
    }
}

package org.example.factory;

public class GeradorFactory {
    public static IGeradorRelatorios geradorRelatorios(String relatorio){
        Class classe = null;
        Object obejto = null;

        try {
            classe = Class.forName("org.example.factory.Relatorio" + relatorio);
            obejto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("O relatório não existe");
        }

        if(!(obejto instanceof IGeradorRelatorios)){
            throw new IllegalArgumentException("Relatório inválido");
        }

        return (IGeradorRelatorios) obejto;
    }
}

package org.example;



public class JogadorEstadoTransferido implements JogadorEstado {

    private JogadorEstadoTransferido() {};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}
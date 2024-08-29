package org.example;



public class JogadorEstadoAposentado implements JogadorEstado {

    private JogadorEstadoAposentado() {};
    private static JogadorEstadoAposentado instance = new JogadorEstadoAposentado();
    public static JogadorEstadoAposentado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aposentado";
    }

}
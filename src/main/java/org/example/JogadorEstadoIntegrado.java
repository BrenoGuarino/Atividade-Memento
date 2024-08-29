package org.example;


public class JogadorEstadoIntegrado implements JogadorEstado {

    private JogadorEstadoIntegrado() {};
    private static JogadorEstadoIntegrado instance = new JogadorEstadoIntegrado();
    public static JogadorEstadoIntegrado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Integrado";
    }

}
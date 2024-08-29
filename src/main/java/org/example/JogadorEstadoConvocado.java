package org.example;



public class JogadorEstadoConvocado implements JogadorEstado {

    private JogadorEstadoConvocado() {};
    private static JogadorEstadoConvocado instance = new JogadorEstadoConvocado();
    public static JogadorEstadoConvocado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Jubilado";
    }

}
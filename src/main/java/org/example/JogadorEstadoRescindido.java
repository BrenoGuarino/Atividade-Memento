package org.example;



public class JogadorEstadoRescindido implements JogadorEstado {

    private JogadorEstadoRescindido() {};
    private static JogadorEstadoRescindido instance = new JogadorEstadoRescindido();
    public static JogadorEstadoRescindido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Rescindido";
    }

}
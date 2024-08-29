import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTeste {

    @Test
    void deveArmazenarEstados() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertEquals(2, jogador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.restauraEstado(0);
        assertEquals(JogadorEstadoIntegrado.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        jogador.setEstado(JogadorEstadoRescindido.getInstance());
        jogador.setEstado(JogadorEstadoIntegrado.getInstance());
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.restauraEstado(2);
        assertEquals(JogadorEstadoIntegrado.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogador jogador = new Jogador();
            jogador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
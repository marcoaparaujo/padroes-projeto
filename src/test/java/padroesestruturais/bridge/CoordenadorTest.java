package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordenadorTest {

    @Test
    void deveRetornarSalarioCoordenadorComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2000.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2200.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2400.0f, coordenador.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCoordenadorComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Coordenador coordenador = new Coordenador(2000.0f);
        coordenador.setEscolaridade(escolaridade);
        assertEquals(2600.0f, coordenador.calcularSalario(), 0.01f);
    }

}
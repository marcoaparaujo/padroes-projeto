package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAdministrativoComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Administrativo administrativo = new Administrativo(1000.0f);
        administrativo.setEscolaridade(escolaridade);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}
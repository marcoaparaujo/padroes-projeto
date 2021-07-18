package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarSalarioProfessorComEnsinoMedio() {
        Escolaridade escolaridade = new EnsinoMedio();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(100.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(110.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(120.0f, professor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioProfessorComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Professor professor = new Professor(50.0f);
        professor.setEscolaridade(escolaridade);
        professor.setNumAulas(2);
        assertEquals(130.0f, professor.calcularSalario(), 0.01f);
    }

}
package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveSomarNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.somarNota(80.0f, 20.0f);
        assertEquals(100.0f, aluno.getNota());
    }

    @Test
    void deveSubtrairNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.subtrairNota(80.0f, 10.0f);
        assertEquals(70.0f, aluno.getNota());
    }

    @Test
    void deveMultiplicarNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.multiplicarNota(80.0f, 1.1f);
        assertEquals(88.0f, aluno.getNota());
    }

    @Test
    void deveDividirNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.dividirNota(100.0f, 2.0f);
        assertEquals(50.0f, aluno.getNota());
    }

    @Test
    void naoDeveDividirNotaAlunoPorZero() {
        try {
            Aluno aluno = new Aluno();
            aluno.dividirNota(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularMediaNotas(70.0f, 80.0f);
        assertEquals(75.0f, aluno.getNota());
    }

}
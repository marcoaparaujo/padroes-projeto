package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveArmazenarEstados() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        assertEquals(2, aluno.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        aluno.restauraEstado(0);
        assertEquals(AlunoEstadoMatriculado.getInstance(), aluno.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Aluno aluno = new Aluno();
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        aluno.setEstado(AlunoEstadoTrancado.getInstance());
        aluno.setEstado(AlunoEstadoMatriculado.getInstance());
        aluno.setEstado(AlunoEstadoFormado.getInstance());
        aluno.restauraEstado(2);
        assertEquals(AlunoEstadoMatriculado.getInstance(), aluno.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Aluno aluno = new Aluno();
            aluno.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
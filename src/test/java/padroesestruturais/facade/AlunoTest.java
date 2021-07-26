package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarPendenciaBiblioteca() {
        Aluno aluno = new Aluno();
        Biblioteca.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarPendenciaSecretaria() {
        Aluno aluno = new Aluno();
        Secretaria.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarPendenciaFinanceiro() {
        Aluno aluno = new Aluno();
        Financeiro.getInstancia().addAlunoPendente(aluno);

        assertEquals(false, aluno.formar());
    }

    @Test
    void deveRetornarAlunoSemPendencia() {
        Aluno aluno = new Aluno();

        assertEquals(true, aluno.formar());
    }

}
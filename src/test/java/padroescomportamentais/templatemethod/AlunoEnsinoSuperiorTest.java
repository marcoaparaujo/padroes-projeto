package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoSuperiorTest {

    @Test
    void deveRetonarAprovado() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.0f);
        aluno.setNota2(6.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoEnsinoSuperior aluno = new AlunoEnsinoSuperior();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        aluno.setNome("Marco");
        aluno.setMatricula(1);
        assertEquals("AlunoGraduacao{matricula=1, nome='Marco', resultado=Aprovado}", aluno.getInfo());
    }
}
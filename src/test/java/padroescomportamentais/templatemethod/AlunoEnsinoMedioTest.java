package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveRetonarAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("Aluno{matricula=2, nome='Marcelo', resultado=Reprovado}", aluno.getInfo());
    }
}
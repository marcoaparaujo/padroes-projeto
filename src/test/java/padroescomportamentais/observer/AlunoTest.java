package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveNotificarUmAluno() {
        Turma turma = new Turma(2021, 1, "Algoritmos", "A");
        Aluno aluno = new Aluno("Aluno 1");
        aluno.matricular(turma);
        turma.lancarNotas();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunos() {
        Turma turma = new Turma(2021, 1, "Algoritmos", "A");
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.matricular(turma);
        aluno2.matricular(turma);
        turma.lancarNotas();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno1.getUltimaNotificacao());
        assertEquals("Aluno 2, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarAluno() {
        Turma turma = new Turma(2021, 1, "Algoritmos", "A");
        Aluno aluno = new Aluno("Aluno 1");
        turma.lancarNotas();
        assertEquals(null, aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoTurmaA() {
        Turma turmaA = new Turma(2021, 1, "Algoritmos", "A");
        Turma turmaB = new Turma(2021, 1, "Algoritmos", "B");
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.matricular(turmaA);
        aluno2.matricular(turmaB);
        turmaA.lancarNotas();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno1.getUltimaNotificacao());
        assertEquals(null, aluno2.getUltimaNotificacao());
    }
}
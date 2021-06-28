package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarAlunosAtivosCurso() {
        Curso curso = new Curso(
                new Aluno("Marco", true),
                new Aluno("Antonio", true),
                new Aluno("Jose", false),
                new Aluno("Maria", true)
        );
        assertEquals(3, Censo.contarAlunosAtivosCurso(curso));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Curso curso = new Curso(
                new Aluno("Marco", true),
                new Aluno("Antonio", true),
                new Aluno("Jose", false),
                new Aluno("Maria", true)
        );
        assertEquals(4, Censo.contarTotalAlunosCurso(curso));
    }

}
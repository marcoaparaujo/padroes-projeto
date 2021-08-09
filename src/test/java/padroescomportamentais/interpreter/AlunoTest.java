package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Aluno aluno = new Aluno();
        aluno.setNota1(2.0);
        aluno.setNota2(5.0);

        assertEquals(9.0, aluno.calcularNota());
    }

}
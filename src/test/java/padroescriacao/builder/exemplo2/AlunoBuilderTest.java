package padroescriacao.builder.exemplo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBuilderTest {

    @Test
    void deveRetornarAlunoSemNomeNulo() {
        AlunoBuilder alunoBuilder = new AlunoBuilder();
        Aluno aluno = alunoBuilder
                .setMatricula(1)
                .setEmail("aluno1@email.com")
                .build();

        assertNull(aluno);
    }

    @Test
    void deveRetornarAluno() {
        AlunoBuilder alunoBuilder = new AlunoBuilder();
        Aluno aluno = alunoBuilder
                .setMatricula(1)
                .setNome("Aluno 1")
                .build();

        assertNotNull(aluno);
    }
}
package padroescriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBuilderTest {

    @Test
    void deveRetornarExcecaoParaAlunoSemMatricula() {
        try {
            AlunoBuilder alunoBuilder = new AlunoBuilder();
            Aluno aluno = alunoBuilder
                    .setNome("Aluno 1")
                    .setEmail("aluno1@email.com")
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNome() {
        try {
            AlunoBuilder alunoBuilder = new AlunoBuilder();
            Aluno aluno = alunoBuilder
                    .setMatricula(1)
                    .setEmail("aluno1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        AlunoBuilder alunoBuilder = new AlunoBuilder();
        Aluno aluno = alunoBuilder
                .setMatricula(1)
                .setNome("Aluno 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(aluno);
    }
}
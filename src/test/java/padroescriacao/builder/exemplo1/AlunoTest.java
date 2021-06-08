package padroescriacao.builder.exemplo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    public void deveRetonarAluno() {
        Aluno aluno = new Aluno(1, "Aluno1");
        aluno.setCep("12346-789")
                .setEmail("aluno1@email.com")
                .setCelular("1234-5678")
                .setNomeMae("Mae do aluno 1");

        assertNotNull(aluno);
    }


}
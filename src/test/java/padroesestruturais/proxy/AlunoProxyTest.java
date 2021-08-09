package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlunoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addAluno(new Aluno(1, "João", "Juiz de Fora", 8.0f, 9.0f));
        BD.addAluno(new Aluno(2, "Maria", "Juiz de Fora", 10.0f, 10.0f));
    }

    @Test
    void deveRetornarDadosPessoaisAluno() {
        AlunoProxy aluno = new AlunoProxy(1);

        assertEquals(Arrays.asList("João", "Juiz de Fora"), aluno.obterDadosPessoais());
    }

    @Test
    void deveRetonarNotasAluno() {
        Funcionario funcionario = new Funcionario("Ana", true);
        AlunoProxy aluno = new AlunoProxy(2);

        assertEquals(Arrays.asList(10.0f, 10.0f), aluno.obterNotas(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasAluno() {
        try {
            Funcionario funcionario = new Funcionario("Joana", false);
            AlunoProxy aluno = new AlunoProxy(2);

            aluno.obterNotas(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}
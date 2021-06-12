package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Aluno aluno = new Aluno(123, "Aluno Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Aluno alunoClone = aluno.clone();
        alunoClone.setMatricula(456);
        alunoClone.setNome("Aluno Clonado");
        alunoClone.getEndereco().setNumero(2);

        assertEquals("Aluno{matricula=123, nome='Aluno Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", aluno.toString());
        assertEquals("Aluno{matricula=456, nome='Aluno Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", alunoClone.toString());
    }
}
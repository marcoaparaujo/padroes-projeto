package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{matricula=1, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Professor{matricula=1, nome='Maria', titulacao='Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

}
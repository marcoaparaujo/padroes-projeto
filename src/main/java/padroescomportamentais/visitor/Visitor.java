package padroescomportamentais.visitor;

public interface Visitor {

    String exibirAluno(Aluno aluno);
    String exibirProfessor(Professor professor);
    String exibirFuncionario(Funcionario funcionario);

}

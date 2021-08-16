package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "Aluno{" +
                "matricula=" + aluno.getMatricula() +
                ", nome='" + aluno.getNome() + '\'' +
                ", curso=" + aluno.getNomeCurso() +
                '}';
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "Professor{" +
                "matricula=" + professor.getMatricula() +
                ", nome='" + professor.getNome() + '\'' +
                ", titulacao='" + professor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}

package padroesestruturais.proxy;

import java.util.List;

public class AlunoProxy implements IAluno {

    private Aluno aluno;

    private Integer matricula;

    public AlunoProxy(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.aluno == null) {
            this.aluno = new Aluno(this.matricula);
        }
        return this.aluno.obterDadosPessoais();
    }

    @Override
    public List<Float> obterNotas(Funcionario funcionario) {
        if (!funcionario.isAdministrador()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.aluno == null) {
            this.aluno = new Aluno(this.matricula);
        }
        return this.aluno.obterNotas(funcionario);
    }
}

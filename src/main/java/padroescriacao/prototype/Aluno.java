package padroescriacao.prototype;

public class Aluno implements Cloneable {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private String localNascimento;

    public Aluno(int matricula, String nome, Endereco endereco, String localNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.localNascimento = localNascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public Aluno clone() throws CloneNotSupportedException {
        Aluno alunoClone = (Aluno) super.clone();
        alunoClone.endereco = (Endereco) alunoClone.endereco.clone();
        return alunoClone;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}

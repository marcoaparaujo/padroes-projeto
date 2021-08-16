package padroescomportamentais.visitor;

public class Professor implements Pessoa {

    private int matricula;
    private String nome;
    private String titulacao;

    public Professor(int matricula, String nome, String titulacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProfessor(this);
    }

}

package padroesestruturais.flyweight;

public class Aluno {

    private String nome;
    private Cidade cidadeResidencia;

    public Aluno(String nome, Cidade cidadeResidencia) {
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterAluno() {
        return cidadeResidencia.obterAluno(nome);
    }
}

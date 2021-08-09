package padroesestruturais.flyweight;

public class Cidade {

    private String nome;
    private String uf;

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String obterAluno(String nomeAluno) {
        return "Aluno{" +
                "nome='" + nomeAluno + '\'' +
                ", cidade='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}

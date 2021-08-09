package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Aluno> alunos = new ArrayList<>();

    public void matricular(String nomeAluno, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Aluno aluno = new Aluno(nomeAluno, cidade);
        alunos.add(aluno);
    }

    public List<String> obterAlunos() {
        List<String> saida = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            saida.add(aluno.obterAluno());
        }
        return saida;
    }


}

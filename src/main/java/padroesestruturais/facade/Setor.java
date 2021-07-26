package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Aluno> alunosComPendencia = new ArrayList<Aluno>();

    public void addAlunoPendente(Aluno aluno) {
        this.alunosComPendencia.add(aluno);
    }

    public boolean verificarAlunoComPendencia(Aluno aluno) {
        return alunosComPendencia.contains(aluno);
    }

}


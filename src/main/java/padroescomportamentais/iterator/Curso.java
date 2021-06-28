package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Curso implements Iterable<Aluno>{

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(Aluno... alunos) {
        this.alunos = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Aluno> iterator() {
        return alunos.iterator();
    }

}



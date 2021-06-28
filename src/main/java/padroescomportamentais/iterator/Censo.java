package padroescomportamentais.iterator;

import java.util.Iterator;

public class Censo {

    public static Integer contarAlunosAtivosCurso(Curso curso) {
        int quantidade = 0;
        for (Aluno aluno : curso) {
            if (aluno.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAlunosCurso(Curso curso) {
        int quantidade = 0;
        for (Iterator a = curso.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}

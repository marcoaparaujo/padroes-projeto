package padroesestruturais.proxy;

import padroesestruturais.flyweight.Cidade;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Aluno> alunos = new HashMap<>();

    public static Aluno getAluno(Integer matricula) {
        return alunos.get(matricula);
    }

    public static void addAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }
}

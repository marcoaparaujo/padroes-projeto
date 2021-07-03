package padroescomportamentais.observer;

import java.util.Observable;

public class Turma extends Observable {

    private Integer ano;
    private Integer semestre;
    private String nomeDisciplina;
    private String nomeTurma;

    public Turma(Integer ano, Integer semestre, String nomeDisciplina, String nomeTurma) {
        this.ano = ano;
        this.semestre = semestre;
        this.nomeDisciplina = nomeDisciplina;
        this.nomeTurma = nomeTurma;
    }

    public void lancarNotas() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Turma{" +
                "ano=" + ano +
                ", semestre=" + semestre +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", nomeTurma='" + nomeTurma + '\'' +
                '}';
    }
}

package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {

    private String nome;
    private String notificacao;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNotificacao() {
        return this.notificacao;
    }

    public void matricular(Turma turma) {
        turma.addObserver(this);
    }

    public void update(Observable turma, Object arg1) {
        this.notificacao = this.nome + ", nota lançada na " + turma.toString();
    //    System.out.println(this.notificacao);
    }
}

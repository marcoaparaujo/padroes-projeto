package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void matricular(Turma turma) {
        turma.addObserver(this);
    }

    public void update(Observable turma, Object arg1) {
        this.ultimaNotificacao = this.nome + ", nota lançada na " + turma.toString();
    //    System.out.println(this.notificacao);
    }
}

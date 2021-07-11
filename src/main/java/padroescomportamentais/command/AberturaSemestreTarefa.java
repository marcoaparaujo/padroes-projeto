package padroescomportamentais.command;

public class AberturaSemestreTarefa implements Tarefa {

    private Semestre semestre;

    public AberturaSemestreTarefa(Semestre semestre) {
        this.semestre = semestre;
    }

    public void executar() {
        this.semestre.abrirSemestre();
    }

    public void cancelar() {
        this.semestre.fecharSemestre();
    }
}

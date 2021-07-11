package padroescomportamentais.command;

public class FechamentoSemestreTarefa implements Tarefa {

    private Semestre semestre;

    public FechamentoSemestreTarefa(Semestre semestre) {
        this.semestre = semestre;
    }

    public void executar() {
        this.semestre.fecharSemestre();
    }

    public void cancelar() {
        this.semestre.abrirSemestre();
    }
}

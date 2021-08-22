package padroescriacao.abstractfactory;

public class Aluno {

    private Diploma diploma;
    private Historico historico;

    public Aluno (FabricaAbstrata fabrica) {
        this.diploma = fabrica.createDiploma();
        this.historico = fabrica.createHistorico();
    }

    public String emitirDiploma() {
        return this.diploma.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}

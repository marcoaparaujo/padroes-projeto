package padroescriacao.abstractfactory;

public class FabricaGraduacao implements FabricaAbstrata {

    @Override
    public Diploma createDiploma() {
        return new DiplomaGraduacao();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoGraduacao();
    }
}

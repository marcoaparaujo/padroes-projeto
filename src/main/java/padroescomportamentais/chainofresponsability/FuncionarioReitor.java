package padroescomportamentais.chainofresponsability;

public class FuncionarioReitor extends Funcionario {

    public FuncionarioReitor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoDiploma.getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Reitor";
    }

}

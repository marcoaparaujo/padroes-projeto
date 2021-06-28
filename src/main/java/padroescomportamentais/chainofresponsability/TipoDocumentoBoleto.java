package padroescomportamentais.chainofresponsability;

public class TipoDocumentoBoleto implements TipoDocumento {

    private static TipoDocumentoBoleto tipoDocumentoBoleto = new TipoDocumentoBoleto();

    private TipoDocumentoBoleto() {};
    
    public static TipoDocumentoBoleto getTipoDocumentoBoleto() {
        return tipoDocumentoBoleto;
    }
}

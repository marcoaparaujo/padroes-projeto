package padroescomportamentais.chainofresponsability;

public class TipoDocumentoCertificado implements TipoDocumento {

    private static TipoDocumentoCertificado tipoDocumentoCertificado = new TipoDocumentoCertificado();

    private TipoDocumentoCertificado() {};

    public static TipoDocumentoCertificado getTipoDocumentoCertificado() {
        return tipoDocumentoCertificado;
    }
}

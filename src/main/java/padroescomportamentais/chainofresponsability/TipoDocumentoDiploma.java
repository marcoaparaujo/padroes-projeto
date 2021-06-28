package padroescomportamentais.chainofresponsability;

public class TipoDocumentoDiploma implements TipoDocumento {

    private static TipoDocumentoDiploma tipoDocumentoDiploma = new TipoDocumentoDiploma();

    private TipoDocumentoDiploma() {};

    public static TipoDocumentoDiploma getTipoDocumentoDiploma() {
        return tipoDocumentoDiploma;
    }
}

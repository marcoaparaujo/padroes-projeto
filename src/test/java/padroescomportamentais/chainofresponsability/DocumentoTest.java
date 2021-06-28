package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioReitor reitor;
    FuncionarioDiretor diretor;
    FuncionarioCoordenador coordenador;
    FuncionarioSecretaria secretaria;

    @BeforeEach
    void setUp() {
        reitor = new FuncionarioReitor(null);
        diretor = new FuncionarioDiretor(reitor);
        coordenador = new FuncionarioCoordenador(diretor);
        secretaria = new FuncionarioSecretaria(coordenador);
    }

    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico() {
        assertEquals("Secretaria", secretaria.assinarDocumento(new Documento(TipoDocumentoHistorico.getTipoDocumentoHistorico())));
    }

    @Test
    void deveRetornarCoordenadorParaAssinaturaMatricula() {
        assertEquals("Coordenador", secretaria.assinarDocumento(new Documento(TipoDocumentoMatricula.getTipoDocumentoMatricula())));
    }

    @Test
    void deveRetornarDiretorParaAssinaturaCertificado() {
        assertEquals("Diretor", secretaria.assinarDocumento(new Documento(TipoDocumentoCertificado.getTipoDocumentoCertificado())));
    }

    @Test
    void deveRetornarReitorParaAssinaturaDiploma() {
        assertEquals("Reitor", secretaria.assinarDocumento(new Documento(TipoDocumentoDiploma.getTipoDocumentoDiploma())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem assinatura", secretaria.assinarDocumento(new Documento(TipoDocumentoBoleto.getTipoDocumentoBoleto())));
    }

}
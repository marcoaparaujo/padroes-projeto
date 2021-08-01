package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSecretaria(mensagem);
    }

    public String reclamarSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSecretaria(mensagem);
    }

    public String sugerirSecretaria(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSecretaria(mensagem);
    }


}

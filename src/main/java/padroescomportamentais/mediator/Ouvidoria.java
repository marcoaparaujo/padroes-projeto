package padroescomportamentais.mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Secretaria.getInstancia().receberSugestao(mensagem);
    }

}

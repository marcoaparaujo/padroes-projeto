package padroescomportamentais.mediator;

public class Secretaria implements Setor {

    private static Secretaria instancia = new Secretaria();

    private Secretaria() {}

    public static Secretaria getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Secretaria vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Secretaria agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Secretaria vai analisar a sugestão: " + mensagem;
    }
}

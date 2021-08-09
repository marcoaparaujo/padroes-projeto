package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {
    static Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome, String uf) {
        Cidade cidade = cidades.get(nome);
        if (cidade == null) {
            cidade = new Cidade(nome, uf);
            cidades.put(nome, cidade);
        }
        return cidade;
    }

    public static int getTotalCidades() {
        return cidades.size();
    }

}





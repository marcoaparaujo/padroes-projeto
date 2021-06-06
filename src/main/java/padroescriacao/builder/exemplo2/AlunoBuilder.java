package padroescriacao.builder.exemplo2;

import java.util.Date;

public class AlunoBuilder {

    private Aluno aluno;

    public AlunoBuilder() {
        aluno = new Aluno();
    }

    public Aluno build() {
        if (aluno.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (aluno.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return aluno;
    }

    public AlunoBuilder setMatricula(int matricula) {
        aluno.setMatricula(matricula);
        return this;
    }

    public AlunoBuilder setNome(String nome) {
        aluno.setNome(nome);
        return this;
    }

    public AlunoBuilder setDataNascimento(Date dataNascimento) {
        aluno.setDataNascimento(dataNascimento);
        return this;
    }

    public AlunoBuilder setNomeMae(String nomeMae) {
        aluno.setNomeMae(nomeMae);
        return this;
    }

    public AlunoBuilder setNomePai(String nomePai) {
        aluno.setNomePai(nomePai);
        return this;
    }

    public AlunoBuilder setCpf(String cpf) {
        aluno.setCpf(cpf);
        return this;
    }

    public AlunoBuilder setRg(String rg) {
        aluno.setRg(rg);
        return this;
    }

    public AlunoBuilder setEscolaAnterior(String escolaAnterior) {
        aluno.setEscolaAnterior(escolaAnterior);
        return this;
    }

    public AlunoBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        aluno.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public AlunoBuilder setEnderecoNumero(int enderecoNumero) {
        aluno.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public AlunoBuilder setEnderecoComplemento(String enderecoComplemento) {
        aluno.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public AlunoBuilder setEnderecoBairro(String enderecoBairro) {
        aluno.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public AlunoBuilder setEnderecoCidade(String enderecoCidade) {
        aluno.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public AlunoBuilder setEnderecoUF(String enderecoUF) {
        aluno.setEnderecoUF(enderecoUF);
        return this;
    }

    public AlunoBuilder setCep(String cep) {
        aluno.setCep(cep);
        return this;
    }

    public AlunoBuilder setEmail(String email) {
        aluno.setEmail(email);
        return this;
    }

    public AlunoBuilder setCelular(String celular) {
        aluno.setCelular(celular);
        return this;
    }

}

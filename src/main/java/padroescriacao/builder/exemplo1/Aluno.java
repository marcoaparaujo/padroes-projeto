package padroescriacao.builder.exemplo1;

import java.util.Date;

public class Aluno {

    private int matricula;
    private String nome;
    private Date dataNascimento;
    private String nomeMae;
    private String nomePai;
    private String cpf;
    private String rg;
    private String escolaAnterior;
    private String enderecoLogradouro;
    private int enderecoNumero;
    private String enderecoComplemento;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoUF;
    private String cep;
    private String email;
    private String celular;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Aluno setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Aluno setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Aluno setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public String getNomeMae(String s) {
        return nomeMae;
    }

    public Aluno setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
        return this;
    }

    public String getNomePai() {
        return nomePai;
    }

    public Aluno setNomePai(String nomePai) {
        this.nomePai = nomePai;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Aluno setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getRg() {
        return rg;
    }

    public Aluno setRg(String rg) {
        this.rg = rg;
        return this;
    }

    public String getEscolaAnterior() {
        return escolaAnterior;
    }

    public Aluno setEscolaAnterior(String escolaAnterior) {
        this.escolaAnterior = escolaAnterior;
        return this;
    }

    public String getEnderecoLogradouro() {
        return enderecoLogradouro;
    }

    public Aluno setEnderecoLogradouro(String enderecoLogradouro) {
        this.enderecoLogradouro = enderecoLogradouro;
        return this;
    }

    public int getEnderecoNumero() {
        return enderecoNumero;
    }

    public Aluno setEnderecoNumero(int enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
        return this;
    }

    public String getEnderecoComplemento() {
        return enderecoComplemento;
    }

    public Aluno setEnderecoComplemento(String enderecoComplemento) {
        this.enderecoComplemento = enderecoComplemento;
        return this;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public Aluno setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
        return this;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public Aluno setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
        return this;
    }

    public String getEnderecoUF() {
        return enderecoUF;
    }

    public Aluno setEnderecoUF(String enderecoUF) {
        this.enderecoUF = enderecoUF;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Aluno setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Aluno setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCelular() {
        return celular;
    }

    public Aluno setCelular(String celular) {
        this.celular = celular;
        return this;
    }

}

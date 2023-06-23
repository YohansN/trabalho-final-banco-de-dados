package br.com.frota.model;

public class Pessoa extends GenericModel {
    private String nome;
    private String cpf;
    private String cnpj;
    private Integer tipoPessoaId;

    public Pessoa(Integer id, String nome, String cpf, String cnpj, Integer tipoPessoaId) {
        super.setId(id);
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoaId = tipoPessoaId;
    }

    public Pessoa(Integer id, String nome, String cpf, Integer tipoPessoaId) {
        super.setId(id);
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = null;
        this.tipoPessoaId = tipoPessoaId;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getTipoPessoaId() {
        return tipoPessoaId;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + this.getId() + '\'' +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", tipoPessoaId=" + tipoPessoaId +
                '}';
    }
}

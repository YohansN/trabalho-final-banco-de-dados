package br.com.frota.model;

import br.com.frota.DAO.TipoPessoaDAO;

public class Pessoa extends GenericModel {
    private String nome;
    private String cpf;
    private String cnpj;
    private Integer tipoPessoaId;
    static private TipoPessoaDAO tipoPessoa = new TipoPessoaDAO();

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

    public Pessoa(String nome, String cpf, String cnpj, Integer tipoPessoaId) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoaId = tipoPessoaId;
    }

    public Pessoa(String nome, String cpf, Integer tipoPessoaId) {
        this.nome = nome;
        this.cpf = cpf;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTipoPessoaId(Integer tipoPessoaId) {
        this.tipoPessoaId = tipoPessoaId;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + this.getId() + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", tipoPessoaId=" + tipoPessoa.selectTipoPessoaById(tipoPessoaId) +
                '}';
    }
}

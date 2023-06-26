package br.com.frota.model;

public class BoletoEnergia extends GenericModel{
    private String nome;
    private String cpf;
    private String cnpj;
    private Integer tipoPessoaId;
    private String numCliente;
    private String numDocumento;
    private String descricaoRota;
    private String descricaoMedidor;

    public BoletoEnergia(String nome, String cpf, String cnpj, Integer tipoPessoaId, String numCliente, String numDocumento, String descricaoRota, String descricaoMedidor) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoaId = tipoPessoaId;
        this.numCliente = numCliente;
        this.numDocumento = numDocumento;
        this.descricaoRota = descricaoRota;
        this.descricaoMedidor = descricaoMedidor;
    }
    public BoletoEnergia(Integer id, String nome, String cpf, String cnpj, Integer tipoPessoaId, String numCliente, String numDocumento, String descricaoRota, String descricaoMedidor) {
        super.setId(id);
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipoPessoaId = tipoPessoaId;
        this.numCliente = numCliente;
        this.numDocumento = numDocumento;
        this.descricaoRota = descricaoRota;
        this.descricaoMedidor = descricaoMedidor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getTipoPessoaId() {
        return tipoPessoaId;
    }

    public void setTipoPessoaId(Integer tipoPessoaId) {
        this.tipoPessoaId = tipoPessoaId;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getDescricaoRota() {
        return descricaoRota;
    }

    public void setDescricaoRota(String descricaoRota) {
        this.descricaoRota = descricaoRota;
    }

    public String getDescricaoMedidor() {
        return descricaoMedidor;
    }

    public void setDescricaoMedidor(String descricaoMedidor) {
        this.descricaoMedidor = descricaoMedidor;
    }

    @Override
    public String toString() {
        return "BoletoEnergia{" +
                "id='" + this.getId() + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", tipoPessoaId=" + tipoPessoaId +
                ", numCliente='" + numCliente + '\'' +
                ", numDocumento='" + numDocumento + '\'' +
                ", descricaoRota='" + descricaoRota + '\'' +
                ", descricaoMedidor='" + descricaoMedidor + '\'' +
                '}';
    }
}

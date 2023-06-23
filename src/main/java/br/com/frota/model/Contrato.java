package br.com.frota.model;

public class Contrato extends GenericModel{
    private String descricao;
    private String dataInicio;
    private String dataCriacao;
    private Integer medidorId;
    private Integer classeId;
    private Integer clienteId;

    public Contrato(Integer id, String descricao, String dataInicio, String dataCriacao, Integer medidorId, Integer classeId, Integer clienteId) {
        super.setId(id);
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataCriacao = dataCriacao;
        this.medidorId = medidorId;
        this.classeId = classeId;
        this.clienteId = clienteId;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public Integer getMedidorId() {
        return medidorId;
    }

    public Integer getClasseId() {
        return classeId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id='" + this.getId() + '\'' +
                "descricao='" + descricao + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", medidorId=" + medidorId +
                ", classeId=" + classeId +
                ", clienteId=" + clienteId +
                '}';
    }
}
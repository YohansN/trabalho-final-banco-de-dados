package br.com.frota.model;

public class Contrato extends GenericModel{
    private String descricao;
    private String dataInicio;
    private String dataCriacao;
    private Medidor medidorId;
    private Classe classeId;
    private Cliente clienteId;

    public Contrato(Integer id, String descricao, String dataInicio, String dataCriacao, Medidor medidorId, Classe classeId, Cliente clienteId) {
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
        return medidorId.getId();
    }

    public Integer getClasseId() {
        return classeId.getId();
    }

    public Integer getClienteId() {
        return clienteId.getId();
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
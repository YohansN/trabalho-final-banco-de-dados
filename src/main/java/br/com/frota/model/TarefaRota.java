package br.com.frota.model;

public class TarefaRota extends GenericModel{
    private String observacao;
    private String dataInicio;
    private String dataFim;
    private String tarefaRotacao;
    private Integer rotaId;

    public TarefaRota(Integer id, String observacao, String dataInicio, String dataFim, String tarefaRotacao, Integer rotaId) {
        super.setId(id);
        this.observacao = observacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tarefaRotacao = tarefaRotacao;
        this.rotaId = rotaId;
    }

    public String getObservacao() {
        return observacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public String getTarefaRotacao() {
        return tarefaRotacao;
    }

    public Integer getRotaId() {
        return rotaId;
    }

    @Override
    public String toString() {
        return "TarefaRota{" +
                "id='" + this.getId() + '\'' +
                "observacao='" + observacao + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", tarefaRotacao='" + tarefaRotacao + '\'' +
                ", rotaId=" + rotaId +
                '}';
    }
}
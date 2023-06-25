package br.com.frota.model;

import br.com.frota.DAO.RotaDAO;

import java.sql.Timestamp;

public class TarefaRota extends GenericModel{
    private String observacao;
    private Timestamp dataInicio;
    private Timestamp dataFim;
    private String tarefaRotacao;
    private Integer rotaId;
    static private RotaDAO rotaDao = new RotaDAO();

    public TarefaRota(Integer id, String observacao, Timestamp dataInicio, Timestamp dataFim, String tarefaRotacao, Integer rotaId) {
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

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public Timestamp getDataFim() {
        return dataFim;
    }

    public String getTarefaRotacao() {
        return tarefaRotacao;
    }

    public Integer getRotaId() {
        return rotaId;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }

    public void setTarefaRotacao(String tarefaRotacao) {
        this.tarefaRotacao = tarefaRotacao;
    }

    public void setRotaId(Integer rotaId) {
        this.rotaId = rotaId;
    }

    @Override
    public String toString() {
        return "TarefaRota{" +
                "id='" + this.getId() + '\'' +
                "observacao='" + observacao + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", tarefaRotacao='" + tarefaRotacao + '\'' +
                ", rotaId=" + rotaDao.selectRotaById(rotaId) +
                '}';
    }
}
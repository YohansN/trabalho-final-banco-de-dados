package br.com.frota.model;

public class TimeRota extends GenericModel{
    private Integer funcionarioId;
    private Integer tarefaRotaId;

    public TimeRota(Integer id, Integer funcionarioId, Integer tarefaRotaId) {
        super.setId(id);
        this.funcionarioId = funcionarioId;
        this.tarefaRotaId = tarefaRotaId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public Integer getTarefaRotaId() {
        return tarefaRotaId;
    }

    @Override
    public String toString() {
        return "TimeRota{" +
                "id='" + this.getId() + '\'' +
                "funcionarioId=" + funcionarioId +
                ", tarefaRotaId=" + tarefaRotaId +
                '}';
    }
}
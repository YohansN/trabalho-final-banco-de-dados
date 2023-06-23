package br.com.frota.model;

public class TimeRota extends GenericModel{
    private Funcionario funcionarioId;
    private TarefaRota tarefaRotaId;

    public TimeRota(Integer id, Funcionario funcionarioId, TarefaRota tarefaRotaId) {
        super.setId(id);
        this.funcionarioId = funcionarioId;
        this.tarefaRotaId = tarefaRotaId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId.getId();
    }

    public Integer getTarefaRotaId() {
        return tarefaRotaId.getId();
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
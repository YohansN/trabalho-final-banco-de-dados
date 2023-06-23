package br.com.frota.model;

public class Medicao extends GenericModel{
    private String mes;
    private String ano;
    private String dataMedicao;
    private String consumo;
    private Medidor medidorId;
    private TimeRota timeRotaId;

    public Medicao(Integer id, String mes, String ano, String dataMedicao, String consumo, Medidor medidorId, TimeRota timeRotaId) {
        super.setId(id);
        this.mes = mes;
        this.ano = ano;
        this.dataMedicao = dataMedicao;
        this.consumo = consumo;
        this.medidorId = medidorId;
        this.timeRotaId = timeRotaId;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }

    public String getDataMedicao() {
        return dataMedicao;
    }

    public String getConsumo() {
        return consumo;
    }

    public Integer getMedidorId() {
        return medidorId.getId();
    }

    public Integer getTimeRotaId() {
        return timeRotaId.getId();
    }

    @Override
    public String toString() {
        return "Medicao{" +
                "id='" + this.getId() + '\'' +
                "mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", dataMedicao='" + dataMedicao + '\'' +
                ", consumo='" + consumo + '\'' +
                ", medidorId=" + medidorId +
                ", timeRotaId=" + timeRotaId +
                '}';
    }
}